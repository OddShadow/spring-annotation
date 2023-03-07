package org.example;

import org.example.config.MainConfig01;
import org.example.config.MainConfig02;
import org.example.config.MainConfig03;
import org.example.entity.ConditionClassOne;
import org.example.entity.ImportClassOne;
import org.example.entity.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType) {
            System.out.printf("======%s======%n", name);
        }
    
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig01.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.printf("----------%s----------%n", name);
        }
    }
    
    @Test
    public void test02() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig02.class);
        // @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
        System.out.println(applicationContext.getBean("person") == applicationContext.getBean("person"));
    }
    
    @Test
    public void test03() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig03.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.printf("======%s======%n", name);
        }
        // myFactoryBean 实际调用 getObject 创建了另一个 bean FactoryBeanOne
        // & 前置表示获取 myFactoryBean 本身
        System.out.printf("----------%s----------%n", applicationContext.getBean("&myFactoryBean"));
        System.out.printf("----------%s----------%n", applicationContext.getBean("myFactoryBean"));
    }
    
}
