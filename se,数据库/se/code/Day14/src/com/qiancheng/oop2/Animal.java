package com.qiancheng.oop2;

public abstract class Animal {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void run();
	public abstract void run2();
}
