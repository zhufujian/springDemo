package com.study.spring.ioc.step13.proxy.cglib;

/**
 * cglib不需要定义接口，直接给出具体实现
 * @author zhufj
 *
 */
public class TeaOnlineShopCglib{

	public void sellSomething(double money) {
		System.out.println("shop say    :you give me "+money +"$ and I sell you some tea");
	}

}
