package com.homework3;

public class Sound {
	public static void main(String[] args) {
		Cat c = new Cat("miao...");
//		Dog d = new Dog("wang..");
		//ʵ����������
		Creature cc = new Creature();
		//����è������
		cc.setNarl(c);
		System.out.println(cc.output());
	}
}
