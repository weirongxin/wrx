package com.qiancheng.work1;

public class LazyUser {
	private String name;
	private int age;
	private static LazyUser user;
	
	private LazyUser(){}
	public static synchronized LazyUser getInstance(){
		if(user == null){
			user = new LazyUser();
		}
		return user;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void speak(){
		System.out.println("ÆðÁ¢");
	}
}
