package com.qiancheng.thread4.join;

public class Test {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();
		MyThread mt4 = new MyThread();
		
		Thread th1 = new Thread(mt1);
		th1.setName("线程1");
		Thread th2 = new Thread(mt2);
		th2.setName("线程2");
		Thread th3 = new Thread(mt3);
		th3.setName("线程3");
		Thread th4 = new Thread(mt4);
		th4.setName("线程4");

		th1.start();
		th2.start();
		try {
			//当前线程执行完成 、结束后  后续线程才可被执行
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th3.start();
		th4.start();
	}

}
