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
		System.out.println("ÐòºÅ£º"+id);
	}
	@Override
	public String toString() {
		return "Student Ñ§ºÅ£º" + id ;
	}
	
}
