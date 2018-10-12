package com.study.spring.ioc.step09;

import org.springframework.beans.factory.BeanNameAware;

public class MyBeanNameAware implements BeanNameAware {

	@Override
	public void setBeanName(String name) {
		System.out.println("my name is "+name);
	}

}
