package com.study.spring.ioc.step05;

public class DataSourceConnection {

	private String driver;

	private String jdbcName;

	private String password;

	private String url;

	/**
	 * 这里得出数据库链接的各个属性
	 */
	public void initConnection() {
		System.out
				.println("I am database connection ,and I get connection by dirver :"
						+ driver
						+ " and jdbcName :"
						+ jdbcName
						+ " and password:" + password);
	}

	public DataSourceConnection() {

	}

	public DataSourceConnection(String driver, String jdbcName,
			String password, String url) {
		this.driver = driver;
		this.jdbcName = jdbcName;
		this.password = password;
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getJdbcName() {
		return jdbcName;
	}

	public void setJdbcName(String jdbcName) {
		this.jdbcName = jdbcName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
