package com.study.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring.ioc.step04.Teacher;

public class SpringIoC_Step04_Test{
	
	
	@SuppressWarnings("resource")
	@Test
	public void test2() throws Exception{ 
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringIoC_Step04.xml");
		 Teacher teacher = applicationContext.getBean("teacher",Teacher.class);
		 teacher.teach();  
		 
	}

}
