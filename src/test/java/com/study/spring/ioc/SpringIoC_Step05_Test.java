package com.study.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring.ioc.step05.DataSourceConnection;

public class SpringIoC_Step05_Test{
	
	
	@SuppressWarnings("resource")
	@Test
	public void test() throws Exception{ 
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringIoC_Step05.xml");
		 DataSourceConnection dataSourceConnection = applicationContext.getBean("dataSourceConnection",DataSourceConnection.class);
		 dataSourceConnection.initConnection();
		  
	}

}
