package org.example;

import lombok.Getter;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new Cat().func();
        Animal a = new Cat();
        System.out.println(a.getA());
        System.out.println( "Hello World!" );
    }
}

@Getter
class Animal {
    private int a = 1;
    protected int c= 0;

    protected void func(){
        System.out.println("cc");
    }
}
@Getter
class Cat extends Animal {
    private int a = 2;
    private int b = 3;


    protected void fun() {
        func();
    }
}