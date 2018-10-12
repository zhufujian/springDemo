package com.study.spring.ioc.step07;

/**
 * mysql数据操作
 * @author
 *
 */
public class MysqlDB implements DBOperation<MysqlDBEntity>{

	public int save(MysqlDBEntity t) {
		System.out.println("save object to mysql");
		return 1;
	}

	public int update(MysqlDBEntity t) {
		System.out.println("update object to mysql");
		return 0;
	}

	public int delete(MysqlDBEntity t) {
		System.out.println("delete object from mysql");
		return 0;
	}

	public MysqlDBEntity select(Integer id) {
		return new MysqlDBEntity();
	}
}