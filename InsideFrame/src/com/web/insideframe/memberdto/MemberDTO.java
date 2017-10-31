package com.web.insideframe.memberdto;

public class MemberDTO {
	   private String email;
	   private String pw;
	   private String name;
	   private String mType;
	   private int admin;
	   
	   
	   public MemberDTO(String email, String pw, String name, String mType) {
		super();
		this.email = email;
		this.pw = pw;
		this.name = name;
		this.mType = mType;
	}
	public String getEmail() {
	      return email;
	   }
	   public void setEmail(String email) {
	      this.email = email;
	   }
	   public String getPw() {
	      return pw;
	   }
	   public void setPw(String pw) {
	      this.pw = pw;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getmType() {
	      return mType;
	   }
	   public void setmType(String mType) {
	      this.mType = mType;
	   }
	   public int getAdmin() {
	      return admin;
	   }
	   public void setAdmin(int admin) {
	      this.admin = admin;
	   }
	  
	public MemberDTO() {
		super();
	}
	   
	   
	}