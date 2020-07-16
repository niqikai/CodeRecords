package com.example.springboot.controller;

import com.example.springboot.anno.Token;
import com.example.springboot.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author niqikai
 */
@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    @GetMapping("/hi")
    public String hello(@Token("Jack") User user) {
        if (user == null) {
            System.out.println("user is null");
            return "fail";
        }

        System.out.println(user);
        return "hi";
    }
}
