package com.qiancheng.oop3;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Student[] students = new Student[10]; 
		//实例化3个普通学生添加到数组中
		for(int i=0;i<3;i++){
			students[i] = new Student();
		}
		//实例化4个 学生子类对象添加到学生数组中
		for(int i=3;i<7;i++){
			Sister sister = new Sister();
			sister.setSound("加油");
			//往学生数组中添加的为  子类对象
			//引用类型的向上转型
			students[i] = sister;
		}
		//实例化3个 学生子类对象添加到学生数组中
		for(int i=7;i<10;i++){
			Brother b = new Brother();
			b.setSound("一二一");
			//往学生数组中添加的为  子类对象
			//引用类型的向上转型
			students[i] = b;
		}
		
		Random ran = new Random();
		int randomNum = ran.nextInt(students.length);
		Student stu = students[randomNum];
		
		Test t = new Test();
		t.method(stu);
	}
	//功能方法  传入的为学生类型
	public void method(Student stu){
		//学生类中共有的功能  喊口号
		stu.speak();
		//条件判断  子类中独有功能的调用
		if(stu instanceof Sister){
			Sister s = (Sister)stu;
			s.dance();
		}else if(stu instanceof Brother){
			Brother b = (Brother)stu;
			b.run();
		}
	}

}
