package com.example.feignclient.controller;

import com.example.feignclient.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/feign-hello")
    public String helloFeign() {
        List<ServiceInstance> instances = discoveryClient.getInstances("feign-client");
        return helloService.hello();
    }
}
