package com.stw.bountyhunters;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifecycleExample implements InitializingBean, DisposableBean, BeanFactoryAware,
        ApplicationContextAware, BeanNameAware {

    private Integer someINt = 5;
    private String someString = "someString";

    public BeanLifecycleExample() {
        System.out.println("## Lifecycle Constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## Properties are set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## Bean is destroyed");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## Bean has been created");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## Bean will be destroyed soon");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Setting factory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Setting Application Context");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## name of the bean is set: " + s);
    }
}
