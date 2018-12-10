package com.qiancheng.thread2;

public class Test {
	public static void main(String[] args) {
		//线程实现的两种方式：1.继承自Thread类  2.实现Runnable接口
		MyThread mh1 = new MyThread("小明");
		MyThread mh2 = new MyThread("小红");
		
		
		//1.先实例化 实现Runnable接口的线程对象
		CustomThread ct = new CustomThread();
		//2.构造线程对象，传入ct
		Thread th = new Thread(ct);
		th.setName("小白");
		
		
		CustomThread ct2 = new CustomThread();
		Thread th2 = new Thread(ct2);
		th2.setName("HanMeiMei");
		
		
		//设置线程的优先级
		mh1.setPriority(Thread.MAX_PRIORITY);
		th.setPriority(Thread.MIN_PRIORITY);
		
		mh1.start();
		mh2.start();
		th.start();
		th2.start();
		//获取线程的标识符
		long num1 = mh1.getId();
		System.out.println("线程1的标识符："+num1);
		long num2 = mh2.getId();
		System.out.println("线程2的标识符："+num2);
		long num3 = th.getId();
		System.out.println("线程3的标识符："+num3);
		long num4 = th2.getId();
		System.out.println("线程4的标识符："+num4);
	}
}
