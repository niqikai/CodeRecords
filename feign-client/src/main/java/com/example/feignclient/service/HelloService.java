package com.example.feignclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("eureka-provider")
public interface HelloService {
    @GetMapping("/hello")
    String hello();
}
