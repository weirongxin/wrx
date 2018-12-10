package com.qiancheng.homework7;

public class Circle {
	private double radius;
	// 定义一个圆类Circle，描述圆对象。
	// 圆有一个属性radius表示半径，还有一个findArea方法用于计算圆的面积。
	// 定义一个测试类。给半径赋值为5，并且输出圆的面积。
	// 求圆的面积
	public double findArea() {
		return Math.PI * radius * radius;
	}

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
