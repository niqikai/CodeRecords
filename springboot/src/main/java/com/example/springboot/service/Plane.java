package com.example.springboot.service;

import org.springframework.stereotype.Service;
@Service
public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("plane........");
    }
}
