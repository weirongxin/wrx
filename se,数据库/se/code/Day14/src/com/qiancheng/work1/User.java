package com.qiancheng.work1;

public class User {
	private String name;
	private int age;
	
	private static User user = new User();
	private User(){}
	public static User getInstance(){
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
		System.out.println("ÆğÁ¢");
	}
}
