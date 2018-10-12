package com.study.spring.ioc.step17;

/**
 * service接口
 * @author zhufj
 *
 */
public class BussinessServiceImpl implements BussinessService {

	@Override
	public void doSomething() {
		System.out.println("BussinessServiceImpl do things"); 
	}

}
