package com.qiancheng.thread1;

public class MyThread extends Thread {

	
	public MyThread(String name) {
		super(name);
	}

	//Thread��Ϊjava�ṩ�̲߳�����
	//��ʱ�������߳���Ҫִ�еĹ��ܣ�����Ҫ��ӵ�run�����У����ܱ��߳�ִ��
	@Override
	public void run() {
		super.run();
		
		for(int i=0;i<1000;i++){
			System.out.println("�̴߳�ӡ������"+i);
		}
	}
	
}
