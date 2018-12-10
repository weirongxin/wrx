package com.qiancheng.setfun2;

public class Cat implements Comparable<Cat>{
	int age;
	public Cat(int age){
		this.age = age;
	}
	@Override
	public int compareTo(Cat o) {
		return this.age-o.age;
	}
	@Override
	public String toString() {
		return "Cat [age=" + age + "]";
	}
	 
}
