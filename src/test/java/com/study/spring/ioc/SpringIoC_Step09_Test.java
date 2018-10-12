package com.study.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring.ioc.step09.MyBeanNameAware;

public class SpringIoC_Step09_Test{
	
	
	@SuppressWarnings({ "resource", "unused"})
	@Test
	public void test() throws Exception{ 
		  ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringIoC_Step09.xml");
	         MyBeanNameAware myBeanNameAware = applicationContext.getBean("mybeannameaware",MyBeanNameAware.class);
	}   

}
