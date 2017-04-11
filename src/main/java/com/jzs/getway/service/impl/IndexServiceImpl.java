package com.jzs.getway.service.impl;

import com.jzs.getway.dao.OrderDao;
import com.jzs.getway.service.IndexService;
import com.jzs.getway.vo.IndexVO;
import com.jzs.user.dto.UserProtos;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.http.ResponseEntity;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by jiangzs@gmail.com on 2017/3/22.
 */
@Service
@Slf4j
@EnableBinding(Source.class)
public class IndexServiceImpl implements IndexService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public IndexVO getIndexInfo(Integer id) {
        log.info("getIndexInfo thread id:{}  id:{}", Thread.currentThread().getId(), id);

        IndexVO vo = new IndexVO();
        vo.setId(id);

//        vo.setUser(getUserDTO(id));
//        vo.setOrder(getOrderDTO(id));

        Observable.just(vo).flatMap(indexVO -> Observable.zip(
                Observable.fromCallable(() -> orderDao.getOrderDTO(id)).subscribeOn(Schedulers.newThread()),
                Observable.fromCallable(() -> getUserDTO(id)).subscribeOn(Schedulers.newThread()),
                (t1, t2) -> {
                    log.info("zip thread id:{}", Thread.currentThread().getId());
                    vo.setOrder(t1);
                    vo.setUser(t2);
                    return vo;
                }
        )).toBlocking().subscribe(s -> log.info("thread id:{}, vo:{}", Thread.currentThread().getId(), vo.toString()));

        return vo;
    }


    @Autowired
    private RestTemplate template;

    private UserProtos.UserDTO getUserDTO(final Integer id) {
        log.info("getUserDTO thread id:{} ", Thread.currentThread().getId());
        ResponseEntity<UserProtos.UserDTO> userDTO = template.getForEntity("http://UserService/user/" + id, UserProtos.UserDTO.class);
        log.info("getUserDTO thread id:{} userDTO:{}", Thread.currentThread().getId(), userDTO.toString());
        return userDTO.getBody();
    }

    @Autowired
    private Source source;

    @Override
    public String generatorQueue(){
        String msg = new String("generatorQueue  generatorQueue generatorQueue");
        source.output().send(MessageBuilder.withPayload(msg).build());
        log.error(msg);
        return msg;
    }

//    @StreamListener(Sink.INPUT)
//    public void processVote(String vote) {
//        log.info("processVote {}",vote);
//    }

}
