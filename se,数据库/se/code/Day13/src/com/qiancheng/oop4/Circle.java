package com.qiancheng.oop4;

public class Circle extends Shape {
	private int radius;
	public Circle(){}
	public Circle(int radius,String color){
		super(color);
		this.radius = radius;
	}
	@Override
	public void getArea() {
		System.out.println("�����"+Math.PI*radius*radius);
	}

	@Override
	public void getPer() {
		System.out.println("�ܳ���"+2*Math.PI*radius);
	}

	@Override
	public void showAll() {
		System.out.println("�뾶��"+radius);
		getArea();
		getPer();
	}

}
