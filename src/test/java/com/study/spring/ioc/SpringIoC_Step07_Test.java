package com.study.spring.ioc;

import org.junit.Test;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring.ioc.step07.DBOperation;
import com.study.spring.ioc.step07.MysqlDBEntity;

public class SpringIoC_Step07_Test{
	
	
	@SuppressWarnings({ "resource", "rawtypes", "unchecked" })
	@Test
	public void test() throws Exception{ 
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringIoC_Step07.xml");
		 DBOperation dBoperation =  applicationContext.getBean("proxyDB",DBOperation.class);
		 MysqlDBEntity dbEntity = new MysqlDBEntity();
		 dBoperation.save(dbEntity);  
	}   
	@SuppressWarnings({ "resource", "rawtypes", "unchecked" })
	@Test
	public void test2() throws Exception{
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringIoC_Step07.xml");
		 FactoryBean factoryBean =  applicationContext.getBean("&proxyDB",FactoryBean.class);
		 DBOperation db = (DBOperation)factoryBean.getObject();
		 MysqlDBEntity dbEntity = new MysqlDBEntity();
		 db.save(dbEntity);
	}

}
