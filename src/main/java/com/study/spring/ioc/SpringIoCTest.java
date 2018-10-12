package com.study.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCTest {
	
	@Test
	public void test(){
		@SuppressWarnings("resource")
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
		HelloService helloService=(HelloService) applicationContext.getBean("test");
		helloService.say();  
	}

}
