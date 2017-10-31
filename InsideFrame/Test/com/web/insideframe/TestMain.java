package com.web.insideframe;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.web.insideframe.common.DaoFactory;
import com.web.insideframe.memberdao.MemberDAO;
import com.web.insideframe.memberdao.ProfileDAO;
import com.web.insideframe.memberdto.MemberDTO;
import com.web.insideframe.memberdto.ProfileDTO;

public class TestMain {
	@Test
	public void testMemberDB(){
		DaoFactory df = new DaoFactory();
		MemberDTO mdto=new MemberDTO("ysung1223@nate.com","1234","여성","감독");
	    MemberDAO mdao=df.memberDao();
	    
	    mdao.insert(mdto);
	    assertThat(mdto.getEmail(), is("ysung1223@nate.com"));
	    MemberDTO mdto2=mdao.select(mdto.getEmail());
	    assertThat(mdto2.getEmail(),is("ysung1223@nate.com"));
	    assertThat(mdto2.getPw(),is(mdto.getPw()));
	    assertThat(mdto2.getName(),is(mdto.getName()));
	    assertThat(mdto2.getmType(),is(mdto.getmType()));
	     
	    mdao.deleteAll();
	}
	@Test
	public void testProfileDB(){
		DaoFactory df = new DaoFactory();
		ProfileDTO pdto = new ProfileDTO();
		ProfileDAO pdao = df.profileDao();
		
		pdao.insert("ysung1223@nate.com");
		
	}
	
	
	
	
}
