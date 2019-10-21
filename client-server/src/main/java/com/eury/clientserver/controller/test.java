package com.eury.clientserver.controller;

import com.eury.clientserver.service.serviceImpl.HellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;

/**
 * @name : test
 * @Description:
 * @author: eury
 * @date :  2019/7/19
 */
@RestController
public class test {

    @Autowired
    private HellowService hellowService;

    //82
    @RequestMapping("/hello")
    public Object hello() throws ExecutionException, InterruptedException{
        return hellowService.helloService();
    }

}
