package com.demo.designpattern.creational.factory.simple;

/**
 * 由于 ShapeFactory 是根据字符串来创建所需要的类，如果和 Java的反射机制相结合，可以设计出更加解耦的系统。
 * 例如在ShapeFactory中，直接使用反射构造类，那么name就需要传入具体的报名加类。
 * 这是不是看起来和一个东西很像，对没错，就是Spring的 BeanFactory 机制，
 * 利用配置文件 <bean>...</bean>得到要初始化类的名称，然后通过BeanFactory 反射机制创建出类，并注入到系统中，经典的IOC机制
 */
public class ShapeFactory {
    public static final String Line = "line";
    public static final String TRIANGLE = "triangle";


    public static Draw create(String name) {
        if (name == null)
            throw new IllegalArgumentException();

        Draw draw = null;
        if (name.equals(Line)) {
            draw =  new Line();
        } else if (name.equals(TRIANGLE)) {
            draw = new Triangle();
        }
        return draw;
    }

    public static void main(String[] args) {
        Draw draw = ShapeFactory.create(ShapeFactory.Line);
        draw.draw();
    }
}
