package com.web.insideframe.memberdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;
import com.web.insideframe.common.DBConnection;
import com.web.insideframe.memberdto.MemberDTO;
import com.web.insideframe.memberdto.ProfileDTO;

public class ProfileDAO {
	private DBConnection connection;
	
	private Connection conn;
	private PreparedStatement ps;
	private Statement st;
	private ResultSet rs;
	
	private String sql ="";
	
	public void setConnection(DBConnection connection){
		this.connection = connection;
	}
	
	public void insert(String email){
		try {
			conn = connection.getConnetion();
			sql = "insert into profile(email) values(?)";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	

}
