package com.eury.clientserver.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import java.util.concurrent.ExecutionException;

/**
 * @name : HellowService
 * @Description:
 * @author: eury
 * @date :  15:46
 */
@Service
public class HellowService {

    @Autowired
    private RestTemplate restTemplate;

    //请求熔断注解，当服务出现问题时候会执行fallbackMetho属性的名为helloFallBack的方法
    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String helloService() throws ExecutionException, InterruptedException {
        return restTemplate.getForEntity("http://customer-provider/hello",String.class).getBody();
    }

    public String helloFallBack(){
    return "error";
    }
}
