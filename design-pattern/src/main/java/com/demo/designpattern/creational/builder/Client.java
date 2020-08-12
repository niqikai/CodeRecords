package com.demo.designpattern.creational.builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();

        Director director = new Director(builder);

        MacBook macBook = director.construct();

        macBook.show();
    }
}
