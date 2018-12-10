package com.qiancheng.tools2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User();
		//将u对象置为null 、变成游离的内存
		u=null;
		//手动启动垃圾回收器
		System.gc();
		
		System.out.println("-----");
	}

}
