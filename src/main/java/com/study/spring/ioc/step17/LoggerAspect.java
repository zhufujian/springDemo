package com.study.spring.ioc.step17;

import org.aspectj.lang.JoinPoint;

public class LoggerAspect {

	public void doBefore(JoinPoint joinPoint){
		System.out.println("log doBefore method:"+joinPoint.getTarget().getClass().getName()+"."+joinPoint.getSignature().getName());
	}
	public void doAround(JoinPoint joinPoint){
		System.out.println("log doAround method:"+joinPoint.getTarget().getClass().getName()+"."+joinPoint.getSignature().getName());
	}
	public void doAfter(JoinPoint joinPoint){
		System.out.println("log doAfter method:"+joinPoint.getTarget().getClass().getName()+"."+joinPoint.getSignature().getName());
	}
	
}
