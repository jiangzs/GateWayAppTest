package com.jzs.getway.controller;

import com.jzs.getway.service.IndexService;
import com.jzs.getway.service.OrderServiceFeign;
import com.jzs.getway.service.UserServiceFeign;
import com.jzs.getway.vo.IndexVO;
import com.jzs.order.dto.OrderProtos;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jiangzs@gmail.com on 2017/3/21.
 */
@RestController
@Slf4j
public class GateWayAppTestController {

    @Autowired
    private IndexService indexService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/services")
    public List<String> getServices(){
//        return discoveryClient.getServices();
        for (Application application : eurekaClient.getApplications().getRegisteredApplications()) {
            log.info("{}",application.getName());
        }

        return discoveryClient.getServices();
//        return Arrays.asList(tr);
    }


    @GetMapping("/{id}")
    @HystrixCommand
    public IndexVO index(@PathVariable Integer id){
        log.info("id:{}",id);
        IndexVO vo = indexService.getIndexInfo(id);
        log.info("UserServiceFeign home {}",userServiceFeign.home());
        return vo;
    }

    @Autowired
    private UserServiceFeign userServiceFeign;
    @Autowired
    private OrderServiceFeign orderServiceFeign;

    @GetMapping("/orderHome")
    public String getOrder(){
        return  orderServiceFeign.home();
    }

    @GetMapping("/orderHome/order/{id}")
    public OrderProtos.OrderDTO getOrderI(@PathVariable Integer id){
        return  orderServiceFeign.getOrder(id);
    }

}
