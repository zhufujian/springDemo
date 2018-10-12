package com.study.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring.ioc.step14.IBussinessService;

public class SpringIoC_Step14_Test{
	
	
	@SuppressWarnings("resource")
	@Test
	public void test() throws Exception{ 
		
	    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringIoC_Step14.xml");
	    IBussinessService bussinessServiceImpl =  applicationContext.getBean("methodProxy",IBussinessService.class);
        bussinessServiceImpl.bussiness();

	}   
	

}
