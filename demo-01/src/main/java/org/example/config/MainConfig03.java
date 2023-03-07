package org.example.config;

import org.example.condition.MyCondition;
import org.example.entity.ConditionClassOne;
import org.example.entity.ImportClassOne;
import org.example.factorybean.MyFactoryBean;
import org.example.imports.MyImportBeanDefinitionRegistrar;
import org.example.imports.MyImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ImportClassOne.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig03 {
    
    // 返回false不注入 返回true注入
    @Bean
    @Conditional(MyCondition.class)
    public ConditionClassOne conditionClassOne() {
        return new ConditionClassOne();
    }
    
    @Bean
    public MyFactoryBean myFactoryBean() {
        return new MyFactoryBean();
    }
    
}
