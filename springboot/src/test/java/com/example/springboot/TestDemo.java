package com.example.springboot;

import com.example.springboot.service.Flyable;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class TestDemo {

    private final Map<String,Flyable> flyAbles ;

    @Autowired
    public TestDemo(Map<String, Flyable> flyAbles) {
        this.flyAbles = flyAbles;
    }

    @Test
    void test() {
        System.out.println(flyAbles);
    }

    @Test
    void testDemo() {
        List<Integer> lists = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(
                lists.stream().filter(e -> e%2 == 0).count()
        );
        lists.stream()
                .filter(e -> e%2 == 0)
                .forEach(System.out::println);

    }

}
