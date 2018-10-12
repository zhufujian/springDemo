package com.study.spring.ioc.step07;

import org.springframework.beans.factory.FactoryBean;

/**
 * 
 * DB代理，根据用户注入数据库的名称，自动返回对应的数据库操作给用户
 *
 */
public class ProxyDBObject implements FactoryBean<Object>{
	
	private String currentDB;
	

	public String getCurrentDB() {
		return currentDB;
	}

	public void setCurrentDB(String currentDB) {
		this.currentDB = currentDB;
	}

	public Object getObject() throws Exception {
		if("mysql".equals(currentDB)){
			return new MysqlDB();
		}
		return new RedisDB();
	}

	public Class<?> getObjectType() {
		if("mysql".equals(currentDB)){
			return MysqlDB.class;
		}
		return RedisDB.class;
	}

	public boolean isSingleton() {
		return false;
	}

	 
	 

}