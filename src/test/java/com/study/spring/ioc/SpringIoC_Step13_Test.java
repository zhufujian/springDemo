package com.study.spring.ioc;

import java.lang.reflect.Proxy;

import org.junit.Test;

import com.study.spring.ioc.step13.proxy.cglib.TaobaoProxyCglib;
import com.study.spring.ioc.step13.proxy.cglib.TeaOnlineShopCglib;
import com.study.spring.ioc.step13.proxy.jdk.OnlineShop;
import com.study.spring.ioc.step13.proxy.jdk.TaobaoProxy;
import com.study.spring.ioc.step13.proxy.jdk.TeaOnlineShop;

public class SpringIoC_Step13_Test{
	
	
	@Test
	public void test() throws Exception{ 
		
		
		 //被代理的对象
		 TeaOnlineShop teaShop = new TeaOnlineShop();   
		 //Proxy 入参三个 加载器，class文件， 实现innovationhandler接口的代理对象
		 OnlineShop shop = (OnlineShop)Proxy.newProxyInstance(OnlineShop.class.getClassLoader(), 
		     new Class[]{OnlineShop.class}, 
		     new TaobaoProxy(teaShop));
		         
		 shop.sellSomething(20d);

	}   
	@Test
	public void testCgLibProxy(){
		TaobaoProxyCglib proxy = new TaobaoProxyCglib();  
		//通过生成子类的方式创建代理类  
		TeaOnlineShopCglib shopProxy = (TeaOnlineShopCglib)proxy.getProxy(TeaOnlineShopCglib.class);  
		shopProxy.sellSomething(21d); 

	}

}
