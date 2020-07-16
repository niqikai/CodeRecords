package com.demo.designpattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class PoorVipDiscount implements Discount{
    @Override
    public void discount() {
        System.out.println("poor... 90%");
    }
}
