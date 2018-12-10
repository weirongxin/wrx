package com.qiancheng.oop4;

public class Test {

	public static void main(String[] args) {
		//实例化子类时
		//调用子类的默认无参构造方法
		//1.子类实例化时 默认调用子类无参构造
		//2.默认先调用父类的无参构造
		//Sister s = new Sister();
		
		//3.通过子类构造方法 传入参数，
		// 构造方法中先调用父类构造赋值
		Sister s = new Sister("小明");
		//根据子类对象获取数据时，先取子类是否存在、再去父类中的成员
		System.out.println(s.name);
	}

}
