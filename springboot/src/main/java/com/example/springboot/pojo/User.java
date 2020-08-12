package com.example.springboot.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

//@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int i;
    private String name;
    private Integer age;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date birthday;

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


