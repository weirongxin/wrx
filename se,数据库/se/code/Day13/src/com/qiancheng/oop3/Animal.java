package com.qiancheng.oop3;

public abstract class Animal {
	//都有自我介绍功能 但每个动物都需要独有化实现
	//在当前类中只需要做方法声明即可，（子类能够做独有实现）
	//如果方法没有方法体  需要被abstract修饰为抽象方法
	public abstract void say();
	public abstract void run();
	
	//当前抽象类中   可以存在普通的方法
	public void eat(){
		System.out.println("eating....");
	}
	public void sleep(){
		System.out.println("sleep...");
	}
}
