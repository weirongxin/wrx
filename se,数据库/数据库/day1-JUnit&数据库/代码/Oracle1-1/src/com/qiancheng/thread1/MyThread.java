package com.qiancheng.thread1;

public class MyThread extends Thread {

	
	public MyThread(String name) {
		super(name);
	}

	//Thread类为java提供线程操作类
	//耗时操作、线程需要执行的功能，都需要添加到run方法中，才能被线程执行
	@Override
	public void run() {
		super.run();
		
		for(int i=0;i<1000;i++){
			System.out.println("线程打印操作："+i);
		}
	}
	
}
