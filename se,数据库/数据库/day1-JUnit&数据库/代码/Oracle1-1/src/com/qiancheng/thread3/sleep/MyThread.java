package com.qiancheng.thread3.sleep;

public class MyThread extends Thread {

	@Override
	public void run() {
		super.run();
		for(int i = 0;i<100;i++){
			if(i==50){
				try {
					//ͨ�����еķ��� ʹ��ǰ�߳� ����3000����
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(this.getName()+i);
		}
	}
	
	
}
