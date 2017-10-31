package com.web.insideframe.memberdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;
import com.web.insideframe.common.DBConnection;
import com.web.insideframe.memberdto.MemberDTO;

public class MemberDAO {
	private DBConnection connection;
	
	private Connection conn;
	private PreparedStatement ps;
	private Statement st;
	private ResultSet rs;
	
	private String sql ="";
	
	public void setConnection(DBConnection connection){
		this.connection = connection;
	}
	
	public void insert(MemberDTO mdto){
		try {
			conn = connection.getConnetion();
			sql = "insert into member(email,pw,name,mtype) values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, mdto.getEmail());
			ps.setString(2, mdto.getPw());
			ps.setString(3, mdto.getName());
			ps.setString(4, mdto.getmType());

			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public MemberDTO select(String email){
		MemberDTO mdto = null;
		try {
			conn = connection.getConnetion();
			sql = "select * from member where email = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, email);

			rs = ps.executeQuery();
			
			if(rs.next()){
				mdto = new MemberDTO();
				mdto.setEmail(rs.getString("email"));
				mdto.setPw(rs.getString("pw"));
				mdto.setName(rs.getString("name"));
				mdto.setmType(rs.getString("mtype"));
			}
			rs.close();
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return mdto;
	}
	public List selectMembers(MemberDTO mdto){
		//MemberDTO mdto = null;
		List mList = new ArrayList();
		List mList2 = new ArrayList();
		
		/*
		try {
			conn = connection.getConnetion();
			sql = "select * from member";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()){
				mdto = new MemberDTO();
				mdto.setEmail(rs.getString("email"));
				mdto.setPw(rs.getString("pw"));
				mdto.setName(rs.getString("name"));
				mdto.setmType(rs.getString("mtype"));
				
				mList.add(mdto);
			}
			
			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		*/
		return mList;
		
		
	}
	
	
	public List selectAll(){
		MemberDTO mdto = null;
		List mList = new ArrayList();
		try {
			conn = connection.getConnetion();
			sql = "select * from member";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()){
				mdto = new MemberDTO();
				mdto.setEmail(rs.getString("email"));
				mdto.setPw(rs.getString("pw"));
				mdto.setName(rs.getString("name"));
				mdto.setmType(rs.getString("mtype"));
				
				mList.add(mdto);
			}
			
			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return mList;
	}
	
	public void delete(String email){
		MemberDTO mdto = null;
		
		try {
			conn = connection.getConnetion();
			sql = "delete from member where email = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, email);

			ps.executeUpdate();
			
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public void deleteAll(){
		try {
			conn = connection.getConnetion();
			sql = "delete from member";
			ps = conn.prepareStatement(sql);
			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
	
	
}

