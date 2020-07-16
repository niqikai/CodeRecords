package com.demo.designpattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class NewCustomDiscount implements Discount{
    @Override
    public void discount() {
        System.out.println("new... 80%");
    }
}
