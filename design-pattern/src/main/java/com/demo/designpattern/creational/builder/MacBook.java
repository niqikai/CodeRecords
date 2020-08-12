package com.demo.designpattern.creational.builder;

import lombok.Data;

@Data
public  class MacBook {

    private String disk;

    private String cpu;

    private String memory;



    public void show()
    {
        System.out.println("This is a brand new MacBook !!! \n" + this);
    }
}
