package com.qiancheng.oop2;

public class Animal {
	private String name;

	public Animal(){}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void say(){
		System.out.println("�ҽУ�"+name+"    ");
	}
	
}
