package com.demo.designpattern.creational.singleton;

/**
 * 懒汉模式
 */
public class Lazy {
    private static volatile  Lazy instance = null;

    private Lazy() {}

    public static synchronized Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}
