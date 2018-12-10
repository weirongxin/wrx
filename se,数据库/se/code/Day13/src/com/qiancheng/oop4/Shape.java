package com.qiancheng.oop4;

public abstract class Shape {
	private int area;
	private int per;
	private String color;
	
	public Shape(){}
	public Shape(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	
	public abstract void getArea();
	public abstract void getPer();
	public abstract void showAll();
}
