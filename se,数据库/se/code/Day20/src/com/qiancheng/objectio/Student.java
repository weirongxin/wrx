package com.qiancheng.objectio;

import java.io.Serializable;

class Dog implements Serializable{

	private static final long serialVersionUID = -5002524920028594487L;
	
}
public class Student implements Serializable{
	
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = -6347710921021371001L;
	private String name;
	private String gender;
	private int age;
	public Student() {
		super();
	}
	public Student(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
