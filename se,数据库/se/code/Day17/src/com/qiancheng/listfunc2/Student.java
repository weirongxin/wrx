package com.qiancheng.listfunc2;

public class Student {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void say(){
		System.out.println("��ţ�"+id);
	}
	@Override
	public String toString() {
		return "Student ѧ�ţ�" + id ;
	}
	
}
