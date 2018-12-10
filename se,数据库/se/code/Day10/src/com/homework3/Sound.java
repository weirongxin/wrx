package com.homework3;

public class Sound {
	public static void main(String[] args) {
		Cat c = new Cat("miao...");
//		Dog d = new Dog("wang..");
		//实例化动物类
		Creature cc = new Creature();
		//发出猫的声音
		cc.setNarl(c);
		System.out.println(cc.output());
	}
}
