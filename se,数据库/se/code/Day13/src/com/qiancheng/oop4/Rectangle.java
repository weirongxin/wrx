package com.qiancheng.oop4;

public class Rectangle extends Shape {
	private int width;
	private int height;
	public Rectangle() {}
	public Rectangle(int width,int height,String color){
		super(color);
		this.width = width;
		this.height = height;	
	}
	@Override
	public void getArea() {
		System.out.println(width*height);
	}

	@Override
	public void getPer() {
		System.out.println(2*(width+height));
	}

	@Override
	public void showAll() {
		System.out.println("��ȣ�"+width+"�߶ȣ�"+
				height+"��ɫ��"+super.getColor()+"������ܳ���");
		getArea();
		getPer();
	}

}
