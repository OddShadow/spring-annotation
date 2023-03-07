package org.example.factorybean;

import org.example.entity.FactoryBeanOne;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<FactoryBeanOne> {
    
    @Override
    public FactoryBeanOne getObject() throws Exception {
        return new FactoryBeanOne();
    }
    
    @Override
    public Class<?> getObjectType() {
        return FactoryBeanOne.class;
    }
    
    @Override
    public boolean isSingleton() {
        return true;
    }
    
}
