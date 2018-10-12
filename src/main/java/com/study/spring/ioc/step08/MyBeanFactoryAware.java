package com.study.spring.ioc.step08;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class MyBeanFactoryAware implements BeanFactoryAware{

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("I belong to ："+beanFactory);

	}

}
