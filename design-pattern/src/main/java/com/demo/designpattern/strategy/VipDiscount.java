package com.demo.designpattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class VipDiscount implements Discount{
    @Override
    public void discount() {
        System.out.println("Vip... 70%");
    }
}
