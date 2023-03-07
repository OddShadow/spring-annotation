package org.example.config;

import org.example.entity.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig02 {
    
    /**
     * ConfigurableBeanFactory.SCOPE_PROTOTYPE
     * ConfigurableBeanFactory.SCOPE_SINGLETON
     * org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST
     * org.springframework.web.context.WebApplicationContext.SCOPE_SESSION
     */
    @Bean
    @Lazy
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person person() {
        return new Person();
    }
    
}
