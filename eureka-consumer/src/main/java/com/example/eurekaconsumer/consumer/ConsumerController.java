package com.example.eurekaconsumer.consumer;


import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {


    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consumer-hello")
    public String hello(String name) {
        List<ServiceInstance> instances =
                discoveryClient.getInstances("eureka-api");

        if (!instances.isEmpty()) {
            ServiceInstance serviceInstance = instances.get(0);
            return restTemplate.getForObject(
                    serviceInstance.getUri().toString()  + "/hello?name="
                            + name, String.class);
        }
        return "failed";
    }

}
