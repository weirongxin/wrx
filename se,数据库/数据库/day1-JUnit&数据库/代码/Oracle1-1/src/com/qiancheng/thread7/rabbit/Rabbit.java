package com.qiancheng.thread7.rabbit;

public class Rabbit extends Thread{

	@Override
	public void run() {
		super.run();
		for(int i=0;i<=1000;i+=100){
			try {
				Thread.sleep(100);
				System.out.println("�����ܵ�"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//�������ܵ�900��ʱ ���ɾ��� ˯��...
			if(i==900){
				synchronized (this) {
					try {
						System.out.println("����˯�ˡ�����");
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if(i==1000){
				System.out.println("���ӵ����յ㡣����");
			}
			
		}
	}

}
