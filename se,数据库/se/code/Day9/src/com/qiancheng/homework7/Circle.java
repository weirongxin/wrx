package com.qiancheng.homework7;

public class Circle {
	private double radius;
	// ����һ��Բ��Circle������Բ����
	// Բ��һ������radius��ʾ�뾶������һ��findArea�������ڼ���Բ�������
	// ����һ�������ࡣ���뾶��ֵΪ5���������Բ�������
	// ��Բ�����
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
