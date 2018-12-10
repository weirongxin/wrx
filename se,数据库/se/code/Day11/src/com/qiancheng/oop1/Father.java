package com.qiancheng.oop1;

public class Father {
	public float money = 100;
	//私有属性
	private String likes = "打孩子";
	
	public void earnMoney(){
		System.out.println("赚钱....");
	}
	//给当前类的私有属性添加访问器方法
	public String getLikes(){
		return this.likes;
	}
	public void setLikes(String likes){
		this.likes = likes;
	}
}
