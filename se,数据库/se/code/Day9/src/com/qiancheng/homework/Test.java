package com.qiancheng.homework;

public class Test {

	public static void main(String[] args) {
		Point p = new Point(1, 2, 3);
		//��ȡ��ĸ�������
		System.out.println(p.getX()+","+p.getY()+","+p.getZ());
		//��ȡ�㵽ԭ��ľ���ƽ��
		int distance = p.distance();
		System.out.println(distance);
	}
}
