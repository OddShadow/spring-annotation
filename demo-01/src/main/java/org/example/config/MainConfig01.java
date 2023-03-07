package org.example.config;

import org.example.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.example.controller", "org.example.service"})
public class MainConfig01 {
    
    @Bean
    public Person person() {
        return new Person();
    }
    
}
