package com.qiancheng.oop3;

public class PigKing extends Monk{
	String name = "猪八戒";
	public void pull(){
		System.out.println("牵马");
	}
	//在父类中已经存在了eat方法，由于当前类需要对eat方法实现特殊化的独有功能
	//所以在类 对该方法进行重写
	public String eat(){
		return "吃肉。。。";
	}
}
