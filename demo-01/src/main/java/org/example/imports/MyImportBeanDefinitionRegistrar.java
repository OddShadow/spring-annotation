package org.example.imports;

import org.example.entity.ImportBeanDefinitionRegistrarClassOne;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
    
        // 手工注入bean
        RootBeanDefinition beanDefinition = new RootBeanDefinition(ImportBeanDefinitionRegistrarClassOne.class);
        registry.registerBeanDefinition("importBeanDefinitionRegistrarClassOne", beanDefinition);
        
    }
    
}
