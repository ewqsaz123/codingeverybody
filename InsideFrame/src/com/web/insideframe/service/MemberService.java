package com.web.insideframe.service;

import java.util.List;

import com.web.insideframe.common.DaoFactory;
import com.web.insideframe.memberdao.MemberDAO;

public class MemberService {
	DaoFactory df = new DaoFactory();
	MemberDAO mdao = df.memberDao();
	
	public List memberSelectAll(){
		return mdao.selectAll();	
	}
}
