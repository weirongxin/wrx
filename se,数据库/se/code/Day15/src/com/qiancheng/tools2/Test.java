package com.qiancheng.tools2;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person(123);
		Person p2 = new Person(123);
		
		System.out.println(p1);
		System.out.println(p2);
		
		//两个对象通过equals方法比较(默认比较地址)
		if(p1.equals(p2)){
			System.out.println("相同的一个人");
		}else{
			System.out.println("不同的人");
		}
	}

}
