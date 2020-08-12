package com.demo.designpattern.creational.builder;

/**
 * 抽象建造者
 */
public abstract class Builder {
    //创建产品对象

    protected MacBook macBook = new MacBook();

    public abstract void buildCpu();
    public abstract void buildDisk();
    public abstract void buildMemory();


    public MacBook getResult() {
        return macBook;
    }

}
