package com.qiancheng.work2;

public class User {
	private String name;
	private String password;
	public User() {
		super();
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User){
			User user = (User)obj;
			if(this.name.equals(user.name)&& this.password.equals(user.password)){
				return true;
			}
		}
		return super.equals(obj);
	}
	
}
