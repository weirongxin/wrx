package com.qiancheng.oop;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
//		int a = 2;
//		t.method1(a);
//		System.out.println("a:"+a);
		
		Student s = new Student();
		s.setName("小明");
		System.out.println("s的名字"+s.getName());
		t.method2(s);
		System.out.println("方法之后的s的名字"+s.getName());
	}
//	public void method1(int num){
//		num++;
//		System.out.println("num:"+num);
//	}
	public void method2(Student stu){
		stu.setName("小红");
		System.out.println("stu的名字"+stu.getName());
	}
}
