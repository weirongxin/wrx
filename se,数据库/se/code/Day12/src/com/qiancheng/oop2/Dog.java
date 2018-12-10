package com.qiancheng.oop2;

public class Dog extends Animal{

	//当前类对 父类中的方法 重写 做独有功能实现
	public void say(){
		System.out.println("我叫"+getName()+",我是一只超级狗");
	}
	
	public void eatBone(){
		System.out.println("吃骨头。。。");
	}
	
}
