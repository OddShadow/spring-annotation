package org.example;

import org.example.config.MainConfig;
import org.example.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType) {
            System.out.printf("======%s======%n", name);
        }
    
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = applicationContext.getBeanNamesForType(Person.class);
        for (String name : names) {
            System.out.printf("----------%s----------%n", name);
        }
        
    }
    
}
