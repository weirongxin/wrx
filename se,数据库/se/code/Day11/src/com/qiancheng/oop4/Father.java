package com.qiancheng.oop4;

public class Father {
	String name;
	private String like;
	
	//有参构造方法 
	public Father(String name){
		this.name = name;
	}
	
//	public Father(){
//		System.out.println("father 无参构造");
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
