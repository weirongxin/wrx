package com.qiancheng.oop3;

public class Test {

	public static void main(String[] args) {
		//实例化子类对象
		MonkeyKing mon = new MonkeyKing();
		//先调用从父类中继承下来的方法
		System.out.println(mon.eat());
		System.out.println(mon.speak());
		System.out.println(mon.borrow());
		//调用子类中独有的方法
		mon.kill();
		
		//实例化子类对象
		PigKing pig = new PigKing();
		//通过子类对象 访问方法时，访问过程：先取子类本身是否存在该方法
		// 						         如果不存在则调用父类中的方法
		System.out.println("八戒："+pig.eat());
		System.out.println(pig.name);
	}

}
