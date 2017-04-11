package com.jzs.getway.controller;

import com.jzs.getway.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangzs@gmail.com on 2017/4/4.
 */
@RestController
public class QueueController {


    @Autowired
    private IndexService indexService;

    @GetMapping("/gq")
    public String generatorQueue(){
        return  indexService.generatorQueue();
    }
}
