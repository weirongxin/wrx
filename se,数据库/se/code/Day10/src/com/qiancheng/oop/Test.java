package com.qiancheng.oop;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
//		int a = 2;
//		t.method1(a);
//		System.out.println("a:"+a);
		
		Student s = new Student();
		s.setName("С��");
		System.out.println("s������"+s.getName());
		t.method2(s);
		System.out.println("����֮���s������"+s.getName());
	}
//	public void method1(int num){
//		num++;
//		System.out.println("num:"+num);
//	}
	public void method2(Student stu){
		stu.setName("С��");
		System.out.println("stu������"+stu.getName());
	}
}
