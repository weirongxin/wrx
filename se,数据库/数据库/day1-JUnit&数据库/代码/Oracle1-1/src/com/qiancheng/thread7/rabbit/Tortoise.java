package com.qiancheng.thread7.rabbit;

public class Tortoise extends Thread {
	Rabbit r;
	
	public Tortoise(Rabbit r) {
		super();
		this.r = r;
	}
	public Tortoise(){
		super();
	}
	@Override
	public void run() {
		super.run();
		for(int i=0;i<=1000;i+=10){
			try {
				Thread.sleep(100);
				System.out.println("�ڹ��ܵ�"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i==1000){
				System.out.println("�ڹ�ʤ���ˣ������յ㣡");
				//����ס��Ҫ���������Ӷ���  �ٻ�������
				synchronized (r) {
					r.notify();
				}
			}
		}
	}

}
