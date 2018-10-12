package com.study.spring.ioc;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

import com.study.spring.ioc.step14.BussinessServiceImpl;
import com.study.spring.ioc.step14.IBussinessService;
import com.study.spring.ioc.step14.MethodInvokeCountAdvice;

public class SpringIoC_Step16_Test{
	
	
	@Test
	public void test() throws Exception{ 
		
	    ProxyFactory factory=new ProxyFactory();
	    //添加advice
	    factory.addAdvice(new MethodInvokeCountAdvice());
	    IBussinessService bussinessService=new BussinessServiceImpl();
	    //设置目标对象
	    factory.setTarget(bussinessService);
	    factory.setProxyTargetClass(false);
	    //目标对象实现的接口
	    factory.setInterfaces(new Class[]{IBussinessService.class});
	    //获取代理
	    IBussinessService proxy=(IBussinessService) factory.getProxy();
	    proxy.bussiness();
	}   
	@Test
	public void test2() throws Exception{ 
		
		IBussinessService bussinessService=new BussinessServiceImpl();
	    ProxyFactory factory=new ProxyFactory(bussinessService);
	    //添加advice
	    factory.addAdvice(new MethodInvokeCountAdvice());
	    
	    //获取代理
	    IBussinessService proxy=(IBussinessService) factory.getProxy();
	    proxy.bussiness();
	}

}
