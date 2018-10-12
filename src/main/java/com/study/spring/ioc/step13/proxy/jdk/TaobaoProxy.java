package com.study.spring.ioc.step13.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 淘宝代理 jdk的代理要实现InvocationHandler的接口
 * @author zhufj
 *
 */
public class TaobaoProxy implements InvocationHandler{

	/**
     * 被代理的对象
     */
	 private Object proxied;   
     
	 public TaobaoProxy(Object proxied){   
	    this.proxied = proxied;   
	 } 
	 /**
	  * InvocationHandler的核心方法，invoke方法

	  */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//马云爸爸表示收到的钱先放在淘宝，来提高GMV
	  System.out.println("taobao say:    "+args[0]+"$ money temp save to taobao to increase my gmv");
	  return method.invoke( proxied, args);  
	}

}
