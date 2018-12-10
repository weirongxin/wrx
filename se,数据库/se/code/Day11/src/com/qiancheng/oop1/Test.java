package com.qiancheng.oop1;

public class Test {

	public static void main(String[] args) {
//		Father f = new Father();
//		f.money = 1;
//		System.out.println(f.money);
//		f.earnMoney();
		/*
		//1.通过子类访问父类成员
		Son s = new Son();
		System.out.println(s.money);
		s.earnMoney();
		//子类对象通过访问器方法 获取父类中的私有成员
		String fatherLike =  s.getLikes();
		System.out.println("父类的爱好"+fatherLike);
		*/
		//2.通过子类访问父类成员 和 间接父类成员
		SisterChild child = new SisterChild();
		System.out.println(child.money);
		System.out.println(child.sisterMoney); 
		//子类需要通过访问器方法 获取父类、间接父类中的私有成员
		child.getLikes();
	}

}
