package com.qiancheng.thread5.setdaemon;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		super.run();
		for(int i=1;i<=1000;i++){
			System.out.println(this.getName()+"����ɱ�У� "+ i);
			if(this.getName().equals("����")&& i==500){
				System.out.println("����  �䣡����������");
				this.stop();
			}
			
		}
	}
}
