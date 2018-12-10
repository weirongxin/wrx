package com.qiancheng.thread2;
//当前类实现线程接口
public class CustomThread implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			//当前类的父类为Object，所以调用线程方法时需要先获取当前线程，再调用
			System.out.println(Thread.currentThread().getName()+i);
		}
	}

}
