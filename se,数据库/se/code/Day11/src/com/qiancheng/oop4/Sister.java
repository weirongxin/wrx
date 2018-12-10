package com.qiancheng.oop4;

public class Sister extends Father{
	private String gender;
	//父类构造方法一定只能在子类构造的第一行调用
	public Sister(String name){
		//super();
		super(name);
		System.out.println("sister 类 无参构造");
		this.gender = "F";
		this.say();
	}
	//如果父类 默认无参构造没有实现、实现了有参构造
	//则  子类中默认调用 父类构造处都会报错
//	public Sister(){
//		
//	}
	
	public void say(){
		System.out.println("say");
	}
}
