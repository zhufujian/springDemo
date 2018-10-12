package com.study.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring.ioc.step06.Teacher;

public class SpringIoC_Step06_Test{
	
	
	@SuppressWarnings("resource")
	@Test
	public void test() throws Exception{ 
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringIoC_Step06.xml");
		 Teacher teacher = applicationContext.getBean("teacher",Teacher.class);
		 teacher.teach(); 
	}  

}
