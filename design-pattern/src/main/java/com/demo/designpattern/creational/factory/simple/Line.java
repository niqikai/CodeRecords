package com.demo.designpattern.creational.factory.simple;

public class Line implements Draw{
    @Override
    public void draw() {
        System.out.println("===line===");
    }
}
