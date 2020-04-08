package com.example.demo.controller;

import com.example.demo.config.KafkaProducerConfig;
import com.example.demo.entiy.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;

/**
 * @author niqikai
 */
@RestController
@RequestMapping("/send")
@AllArgsConstructor
public class SendController {
    private KafkaTemplate<Object, Object> kafkaTemplate;
    private KafkaProducerConfig kafkaProducerConfig;

    @PostMapping(path = "object")
    public String send(@RequestBody User user) {
        ListenableFuture<SendResult<Object, Object>> future;
        future = kafkaTemplate.send("topic1", user);
        future.addCallback(new ListenableFutureCallback<Object>() {

            @Override
            public void onSuccess(Object o) {
                System.out.println("success");
                System.out.println(o);
            }

            @Override
            public void onFailure(Throwable throwable) {
                System.out.println("failed");

            }
        });
        return "success";
    }




}
