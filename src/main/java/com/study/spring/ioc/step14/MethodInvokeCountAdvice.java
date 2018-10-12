package com.study.spring.ioc.step14;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.springframework.aop.MethodBeforeAdvice;


/**
 * 方法调用次数的统计
 * @author zhufj
 *
 */
public class MethodInvokeCountAdvice implements MethodBeforeAdvice{

	private Map<String,Integer> maps = new HashMap<String,Integer>();

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		String name = method.getName();
		Integer count = maps.get(name);
		count = count == null ? 1 : count+1;
		maps.put(name, count);
		System.out.println("调用了："+maps.get(name)+"次");
	}

}
