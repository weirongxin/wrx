package com.qiancheng.thread5.setdaemon;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		super.run();
		for(int i=1;i<=1000;i++){
			System.out.println(this.getName()+"正在杀敌： "+ i);
			if(this.getName().equals("主公")&& i==500){
				System.out.println("主公  卒！！！！！！");
				this.stop();
			}
			
		}
	}
}
