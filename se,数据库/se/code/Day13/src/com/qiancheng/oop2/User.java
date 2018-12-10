package com.qiancheng.oop2;
//懒汉模式  
//1)构造方法私有化
//2)声明当前类 成员
//3)通过访问器方法获取单实例时 创建
public class User {
	private static User user; 
	private User(){}
	//在调用公有的访问器方法时，再判断是否已经创建了对象
	//如果已经创建出来，则直接返回创建完成的对象
	//没有创建 ，则先创建在返回
	//！！懒汉模式 可能会在多个线程操作时，被多个任务同时访问
	//   多个任务同时访问 则创建实例过程 可能会被多次调用
	//   将当前方法添加线程安全锁 synchronized，确保一次只被一个线程调用
	public synchronized static User getInstance(){
		if(user==null){
			user = new User();
		}
		return user;
	}
}
