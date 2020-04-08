package com.example.demo.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;
@Data
@ToString
@Component
@ConfigurationProperties(prefix = "tencent.data-type", ignoreInvalidFields = true)
@PropertySource("classpath:haha.properties")
public class PropTest {
    private Map<String, Object> mapper;
}
