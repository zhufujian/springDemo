package com.study.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring.ioc.step08.MyBeanFactoryAware;

public class SpringIoC_Step08_Test{
	
	
	@SuppressWarnings({ "resource", "unused"})
	@Test
	public void test() throws Exception{ 
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringIoC_Step08.xml");
		 MyBeanFactoryAware mybeanFactoryAware = applicationContext.getBean("mybeanFactoryAware",MyBeanFactoryAware.class);
	}   

}
