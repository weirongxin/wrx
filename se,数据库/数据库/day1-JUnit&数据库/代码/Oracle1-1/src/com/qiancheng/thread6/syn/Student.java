package com.qiancheng.thread6.syn;

public class Student {
	private String name;
	private String gender;
	
	
	public Student() {
		super();
	}
	public Student(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
