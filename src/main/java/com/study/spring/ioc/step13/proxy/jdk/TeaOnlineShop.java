package com.study.spring.ioc.step13.proxy.jdk;

public class TeaOnlineShop implements OnlineShop{

	public void sellSomething(double money) {
		System.out.println("shop say    :you give me "+money +"$ and I sell you some tea");
	}

}
