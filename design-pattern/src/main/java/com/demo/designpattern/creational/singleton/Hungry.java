package com.demo.designpattern.creational.singleton;


public class Hungry {
    private static final Hungry instance = new Hungry();

    private Hungry() {}

    public static Hungry getInstance() {
        return instance;
    }

}
