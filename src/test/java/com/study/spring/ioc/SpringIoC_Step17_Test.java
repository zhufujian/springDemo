package com.study.spring.ioc;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.spring.ioc.step17.BussinessService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:SpringIoC_Step17.xml")
public class SpringIoC_Step17_Test{
	
	@Resource
	private BussinessService bussinessService;
	
	@Test
	public void testAop() throws Exception{ 
		System.out.println("test");
		bussinessService.doSomething();
	}   

}
