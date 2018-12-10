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
				System.out.println("乌龟跑到"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i==1000){
				System.out.println("乌龟胜利了！到达终点！");
				//先锁住需要操作的兔子对象  再唤醒兔子
				synchronized (r) {
					r.notify();
				}
			}
		}
	}

}
