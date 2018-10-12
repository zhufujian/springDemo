package com.study.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring.ioc.HelloService;

/**
 * Spring是一个框架，是一个容器框架，所谓容器，就是一个可以存放东西的“器皿”，
 * spring的核心思想是IoC，IoC(Inversion of Control)控制反转
 * BeanFactory的功能:
 * 		对外:是一个容器的“勺子”可以帮我们从Spring这个容器里获取我们要的Bean
 * 		对内:有去注册，消除注册，维护一些bean的信息等一些功能，它可以很好的维护容器中的beanDefinition
 * @author zhufj
 *
 */
public class SpringIoC_Step01_Test {
	
	@Test
	public void test(){ 
		@SuppressWarnings("resource")
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringIoC_Step01.xml");
		HelloService helloService=(HelloService) applicationContext.getBean("test");
		helloService.say();      
	}

}
