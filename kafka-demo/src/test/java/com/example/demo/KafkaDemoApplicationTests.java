package com.example.demo;

import com.example.demo.config.KafkaProducerConfig;
import com.example.demo.config.PropTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class KafkaDemoApplicationTests {
	@Autowired
	private PropTest test;

	@Autowired
	private KafkaProducerConfig kafkaProducerConfig;
	@Test
	void test() {
		System.out.println(test);
	}
	@Test
	void test2() {
		System.out.println(kafkaProducerConfig);
	}
}
