package com.jzs.getway.dao;

import com.jzs.order.dto.OrderProtos;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jiangzs@gmail.com on 2017/3/22.
 */
@Component
@Slf4j
public class OrderDao {

    @Autowired
    private RestTemplate template;

    public static final String ORDER_SERVICE = new String("http://OrderService");

    @HystrixCommand(fallbackMethod = "getOrderDTODefault")
    public OrderProtos.OrderDTO getOrderDTO(final Integer id) {
        log.info("getOrderDTO thread id:{} ", Thread.currentThread().getId());
        ResponseEntity<OrderProtos.OrderDTO> OrderDTO = template.getForEntity(ORDER_SERVICE + "/order/" + id, OrderProtos.OrderDTO.class);
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
////            e.printStackTrace();
//        }
        log.info("getOrderDTO thread id:{} OrderDTO:{}", Thread.currentThread().getId(), OrderDTO.toString());
        return OrderDTO.getBody();
    }

    private OrderProtos.OrderDTO getOrderDTODefault(final Integer id) {
        log.info("getOrderDTODefault thread id:{} ", Thread.currentThread().getId());
        return OrderProtos.OrderDTO.newBuilder().build();
    }

}
