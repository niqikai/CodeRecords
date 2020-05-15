package com.example.springboot.aspect;

import lombok.extern.slf4j.Slf4j;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MongoAspect {

//    @Before("execution(* org.springframework.data.mongodb.core.MongoTemplate.find(org.springframework.data.mongodb.core.query.Query, Class, String) )")
    public void before() {

        System.out.println("-------99999999999------");
    }


    @Before("execution(* com.example.springboot.service.Flyable.fly() )")
    public void fly() {

        System.out.println("-------before------");
    }
}
