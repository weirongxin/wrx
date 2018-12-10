package com.qiancheng.homework4;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		p1.movePoint(1, 1);
		System.out.println(p1.getX()+","+p1.getY());

		Point p2 = new Point(4,5);
		p2.movePoint(1, 1);
		System.out.println(p2.getX()+","+p2.getY());
	}

}
