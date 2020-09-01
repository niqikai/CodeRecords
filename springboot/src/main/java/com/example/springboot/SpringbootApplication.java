package com.example.springboot;

import com.example.springboot.common.Result;
import com.example.springboot.pojo.Pojo;
import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}


	@Bean
	Faker faker() {
		return new Faker(new Locale("zh-CN"));
	}

	@GetMapping("test")
	public Result hello(@RequestParam String name, @RequestBody(required = false) Pojo pojo) {
		System.out.println(pojo);
		System.out.println("=========");
		return Result.ofSuccess("hello: " + name);
	}
}
