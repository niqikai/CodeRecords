package com.example.springboot;

import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.Locale;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}


	@Bean
	Faker faker() {
		return new Faker(new Locale("zh-CN"));
	}


//	@Bean
//	public MongoClient mongoClient() {
//		return new MongoClient("47.100.61.116",27017);
//	}
//
//	@Bean
//	public MongoTemplate mongoTemplate() {
//		return new MongoTemplate(mongoClient(), "admin");
//	}
}
