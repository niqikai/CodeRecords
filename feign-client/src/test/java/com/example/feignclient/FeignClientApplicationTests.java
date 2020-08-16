package com.example.feignclient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.List;

@SpringBootTest
class FeignClientApplicationTests {

	@Autowired
	private DiscoveryClient discoveryClient;

	@Test
	void contextLoads() {

		List<ServiceInstance> instances = discoveryClient.getInstances("feign-client");
		System.out.println("asdf");
	}

}
