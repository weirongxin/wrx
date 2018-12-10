package com.qiancheng.thread5.setdaemon;

public class Test {

	public static void main(String[] args) {
		MyThread th = new MyThread("主公");
		MyThread th1 = new MyThread("张飞");
		MyThread th2 = new MyThread("关羽");
		MyThread th3 = new MyThread("赵云");
		//设置  守护线程    如果未设置则为被守护的线程
		//被守护的线程，如果全部死亡则守护线程死亡
		th1.setDaemon(true);
		th2.setDaemon(true);
		th3.setDaemon(true);
		
		th.start();
		th1.start();
		th2.start();
		th3.start();
	}

}
