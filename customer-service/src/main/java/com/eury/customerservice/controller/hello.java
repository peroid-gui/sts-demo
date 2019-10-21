package com.eury.customerservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @name : test
 * @Description:
 * @author: eury
 * @date :  2019/7/19
 */
@RestController
public class hello {

    @RequestMapping("/")
    public Object test(){
        return "hellow word";
    }

    @Value(value = "${server.port}")
    String port;

    //83
    @RequestMapping("/hello")
    public Object hello(){
        return "hello:"+port;
    }

}
