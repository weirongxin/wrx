package com.qiancheng.thread2;
//��ǰ��ʵ���߳̽ӿ�
public class CustomThread implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			//��ǰ��ĸ���ΪObject�����Ե����̷߳���ʱ��Ҫ�Ȼ�ȡ��ǰ�̣߳��ٵ���
			System.out.println(Thread.currentThread().getName()+i);
		}
	}

}
