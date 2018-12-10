package com.qiancheng.homework2;

public class Rectangle {
	// 3����1������һ��������Rectangle��
	// 1)��������������getArea()�������getPer()���ܳ���showAll()�ֱ��ڿ���̨���������������ܳ���
	// 2)��2�����ԣ���length����width
	// 3)ͨ�����췽��Rectangle(int width, int length)���ֱ���������Ը�ֵ
	private int length;
	private int width;

	public Rectangle(){}
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getArea() {
		int area = length * width;
		return area;
	}

	public int getPer() {
		int Per = 2 * (length + width);
		return Per;
	}

	public void showAll() {
		int area = getArea();
		int Per = getPer();
		System.out.println("���εĳ�Ϊ��" + length + "��Ϊ��" + width + "���Ϊ��" + area + "�ܳ�Ϊ��" + Per);

	}

}
