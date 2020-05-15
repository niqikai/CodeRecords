package com.example.springboot.properties;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;


import java.util.List;
import java.util.Map;

//@Component
//@PropertySource("classpath:prop.yml")
//@PropertySource("classpath:prop.properties")
//@PropertySource("classpath:application-prop.yml")
//@PropertySource("classpath:application.yml")
@Getter
@ToString
@AllArgsConstructor
@ConstructorBinding
@ConfigurationProperties(prefix = "prop")
public class Outer {
    private final List<String> list;
    private final Map<String, Object> map;
    private final Car car;
}
