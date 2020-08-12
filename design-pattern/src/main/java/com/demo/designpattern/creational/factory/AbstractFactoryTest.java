package com.demo.designpattern.creational.factory;

/**
 * 工厂方法模式的主要角色如下。
 * 抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。
 * 具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
 * 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
 * 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {

    }
}


// 抽象产品
interface Product {
    void show();
}

// ConcreteProduct:具体产品;
class ConcreteProductA implements Product {

    @Override
    public void show() {
        System.out.println("具体产品A显示...");
    }
}
class ConcreteProductB implements Product {

    @Override
    public void show() {
        System.out.println("具体产品B显示...");
    }
}


//抽象工厂：提供了厂品的生成方法
interface AbstractFactory
{
    public Product newProduct();
}

//具体工厂A：实现了厂品的生成方法
class ConcreteFactoryA implements AbstractFactory
{
    public Product newProduct()
    {
        System.out.println("具体工厂A生成-->具体产品A...");
        return new ConcreteProductA();
    }
}
//具体工厂B：实现了厂品的生成方法
class ConcreteFactoryB implements AbstractFactory
{
    public Product newProduct()
    {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProductB();
    }
}