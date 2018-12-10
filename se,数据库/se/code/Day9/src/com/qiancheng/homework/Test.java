package com.qiancheng.homework;

public class Test {

	public static void main(String[] args) {
		Point p = new Point(1, 2, 3);
		//获取点的各个坐标
		System.out.println(p.getX()+","+p.getY()+","+p.getZ());
		//获取点到原点的距离平方
		int distance = p.distance();
		System.out.println(distance);
	}
}
