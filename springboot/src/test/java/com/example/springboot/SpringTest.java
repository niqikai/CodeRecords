package com.example.springboot;

import com.example.springboot.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {

    @Test
    public void test() {
//        ApplicationContext apx = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext apx = new AnnotationConfigApplicationContext(User.class);

        User user = apx.getBean(User.class);

        user.test();
        {
            {
                System.out.println();
            }
        }

    }
}
