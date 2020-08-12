package com.demo.designpattern.creational.builder;

/**
 * 具体建造者
 */
public class ConcreteBuilder extends Builder {


    @Override
    public void buildCpu() {
        macBook.setCpu("intel i7");
    }

    @Override
    public void buildDisk() {
        macBook.setDisk("SSD");
    }

    @Override
    public void buildMemory() {
        macBook.setMemory("32G");
    }
}
