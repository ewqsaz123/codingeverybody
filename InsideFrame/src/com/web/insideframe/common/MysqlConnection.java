package com.web.insideframe.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection implements DBConnection {

	@Override
	public Connection getConnetion() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/insideframe";
			conn = DriverManager.getConnection(url,"root","1111");
		} catch (Exception e) {
			System.out.println("error:"+e);
		}
		
		return conn;
		
	}

}
