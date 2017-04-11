package com.jzs.getway.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jiangzs@gmail.com on 2017/4/1.
 */
@FeignClient(name = "USERSERVICE" )
public interface UserServiceFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    String home();
}
