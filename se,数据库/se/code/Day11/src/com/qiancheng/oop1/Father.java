package com.qiancheng.oop1;

public class Father {
	public float money = 100;
	//˽������
	private String likes = "����";
	
	public void earnMoney(){
		System.out.println("׬Ǯ....");
	}
	//����ǰ���˽��������ӷ���������
	public String getLikes(){
		return this.likes;
	}
	public void setLikes(String likes){
		this.likes = likes;
	}
}
