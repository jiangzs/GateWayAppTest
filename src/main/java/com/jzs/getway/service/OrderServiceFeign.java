package com.jzs.getway.service;

import com.jzs.order.dto.OrderProtos;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jiangzs@gmail.com on 2017/4/1.
 */
@FeignClient(name = "ORDERSERVICE" )
public interface OrderServiceFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    String home();

    @RequestMapping(method = RequestMethod.GET, value = "/order/{id}", consumes = "application/json")
    OrderProtos.OrderDTO getOrder(@PathVariable("id") Integer id);
}
