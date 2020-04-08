package com.example.springboot.mapping;

import lombok.Data;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Data
public class Factory implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if(event.getApplicationContext().getParent() == null){
            Map<String,TestInterface> beans = event.getApplicationContext().getBeansOfType(TestInterface.class);
            for(TestInterface bean:beans.values()){
                System.err.println(bean == null ? "null" : bean.getClass().getName());
                System.err.println(bean.getType());
            }
        }
    }
}
