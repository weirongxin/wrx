package com.qiancheng.oop1;
//单例模式
public class User {
	//2)User中的单个 唯一对象，不能直接被对象调用
	//如果通过类名调用当前单个实例，则一定需要被static修饰为静态成员
	private static User user = new User();
	
	//1)私有构造方法
	private User(){}
	
	//3)获取私有属性时，通过添加public修饰的方法获取成员
	public static User getInstance(){
		return user;
	}
}
