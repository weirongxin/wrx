package com.qiancheng.tools3;

public class Test {

	public static void main(String[] args) {
		Student stu1 = new Student("xiaoming", "F", 185.0F, 66.9F);
		Student stu2 = new Student("xiaoming", "F", 185.0F, 66.9F);
		if(stu1.equals(stu2)){
			System.out.println("ͬһ��ѧ��");
		}else{
			System.out.println("����ͬһ��ѧ��");
		}
	}

}
