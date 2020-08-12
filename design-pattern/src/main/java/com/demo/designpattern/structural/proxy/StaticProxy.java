package com.demo.designpattern.structural.proxy;

import java.util.Objects;

public class StaticProxy {
    public static void main(String[] args) {
        Subject proxy=new Proxy(new RealSubject());
        proxy.request();
    }
}


//抽象主题
interface Subject {
    void request();
}

//真实主题
class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}

//代理
class Proxy implements Subject {
    private final Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }


    public void preRequest() {
        System.out.println("访问真实主题之前的预处理... ...");
    }
    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理... ...");
    }

    @Override
    public void request() {
        if (Objects.nonNull(subject)) {
            preRequest();
            subject.request();
            postRequest();
        } else {
            throw new RuntimeException("subject is null.. .. ");
        }
    }
}