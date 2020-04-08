package com.example.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author niqikai
 */
@Component
@Slf4j
public class Consumer {
//    @KafkaListener(topics = "topic1")
    public void test(String obj) {
        System.out.println("========"+obj);
    }

}
