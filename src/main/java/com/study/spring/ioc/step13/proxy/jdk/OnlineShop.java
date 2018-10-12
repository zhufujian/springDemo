package com.study.spring.ioc.step13.proxy.jdk;

/**
 * jdk的动态代理必须是面向接口的
 * 定义一个淘宝网店的接口
 * @author zhufj
 *
 */
public interface OnlineShop {
	
    /**
     * 网店抽象：用户给钱买东西
     * @param money
     */
	void sellSomething(double money);

}
