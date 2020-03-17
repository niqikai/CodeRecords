package com.example.springboot.anno;

import java.lang.annotation.*;

@Documented
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String value() default "test";
}
