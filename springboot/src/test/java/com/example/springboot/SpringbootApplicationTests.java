package com.example.springboot;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {
	@Autowired
	private Faker faker;


	@Test
	void test() {
		System.out.println(faker.address().fullAddress());
		System.out.println(faker.job().position());
		System.out.println(faker.name().fullName());
	}

}
