package com.demo.designpattern.creational.builder;

public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 产品构建与组装方法
    public MacBook construct() {
        builder.buildCpu();
        builder.buildDisk();
        builder.buildMemory();
        
        return builder.getResult();
    }

}
