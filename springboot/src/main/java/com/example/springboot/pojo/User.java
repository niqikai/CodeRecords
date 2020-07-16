package com.example.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;private int i;
    private int age;
    public void  test() {
        System.out.println("hello... ...");
        System.out.println();
    }

    public static void main(String[] args) {
        long i = 100L;
        new User().test();
        System.out.println((int) (i%10L));
    }
}


