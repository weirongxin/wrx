package com.qiancheng.homework2;

public class Rectangle {
	// 3．（1）定义一个矩形类Rectangle：
	// 1)定义三个方法：getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、面积、周长。
	// 2)有2个属性：长length、宽width
	// 3)通过构造方法Rectangle(int width, int length)，分别给两个属性赋值
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
		System.out.println("矩形的长为：" + length + "宽为：" + width + "面积为：" + area + "周长为：" + Per);

	}

}
