package com.demo.designpattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class SVipDiscount implements Discount{
    @Override
    public void discount() {
        System.out.println("SVip... 50%");
    }
}
