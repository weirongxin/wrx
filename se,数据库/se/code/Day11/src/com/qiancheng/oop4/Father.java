package com.qiancheng.oop4;

public class Father {
	String name;
	private String like;
	
	//�вι��췽�� 
	public Father(String name){
		this.name = name;
	}
	
//	public Father(){
//		System.out.println("father �޲ι���");
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}
	
}
