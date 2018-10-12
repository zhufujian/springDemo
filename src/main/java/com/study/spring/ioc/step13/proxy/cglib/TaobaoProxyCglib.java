package com.study.spring.ioc.step13.proxy.cglib;
import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


/**
 * cglib要实现MethodInterceptor接口
 * @author lyncc
 *
 */
public class TaobaoProxyCglib implements MethodInterceptor{
	
	private Enhancer enhancer = new Enhancer();  
	
	public Object getProxy(Class clazz){  
	  //用enhancer 重新编制传入的class的对象
	  enhancer.setSuperclass(clazz);  
	  //回调实现CallBack接口的类（MethodInterceptor基础于CallBack）此处就是回调TaobaoProxy
	  enhancer.setCallback(this);  
	  return enhancer.create();  
	 }

	/**
	 * 拦截器
	 */
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		
		  System.out.println("taobao say:    "+args[0]+"$ money temp save to taobao to increase my gmv");
		  
		  Object result = proxy.invokeSuper(obj, args);  
		  return result; 
	}	 

}
