package com.study.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring.ioc.step10.SpringSimpleMultiBean;

public class SpringIoC_Step10_Test{
	
	
	@SuppressWarnings({ "resource"})
	@Test
	public void test() throws Exception{ 
		
		
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringIoC_Step10.xml");
		 SpringSimpleMultiBean bean = applicationContext.getBean("springMultiBean",SpringSimpleMultiBean.class);
		 bean.say(); 
		 //SpringOtherBean springOtherBean = applicationContext.getBean("springOtherBean",SpringOtherBean.class);
	}   

}
