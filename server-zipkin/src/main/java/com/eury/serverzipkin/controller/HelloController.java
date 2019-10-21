package com.eury.serverzipkin.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name : HelloController
 * @Description:
 * @author: eury
 * @date :  14:52
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello zipkin-server";
    }
}
