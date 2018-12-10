package com.qiancheng.single;

public class User {
	private static User user;
	private User(){}
	public synchronized static User getInstance(){
		if(user==null){
			user = new User();
		}
		return user;
	}
}
