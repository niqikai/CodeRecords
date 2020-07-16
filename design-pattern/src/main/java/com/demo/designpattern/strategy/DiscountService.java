package com.demo.designpattern.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountService {

    private List<Discount> discounts;

    @Autowired
    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public void discount() {

    }
}
