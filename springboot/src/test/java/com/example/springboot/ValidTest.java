package com.example.springboot;

import com.example.springboot.valid.UserService;
import com.example.springboot.valid.Vip;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class ValidTest {
    @Autowired
    private UserService userService;

    @Test
    public void test() {
        userService.login(null, null);
        userService.login2(null, null);
    }

    @Test
    public void test2() {
        userService.vip(new Vip("", 18));
        userService.vip(null);
    }
}
