package com.qiancheng.thread7.rabbit;

public class Rabbit extends Thread{

	@Override
	public void run() {
		super.run();
		for(int i=0;i<=1000;i+=100){
			try {
				Thread.sleep(100);
				System.out.println("兔子跑到"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//当兔子跑到900米时 放松警惕 睡觉...
			if(i==900){
				synchronized (this) {
					try {
						System.out.println("兔子睡了。。。");
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if(i==1000){
				System.out.println("兔子到达终点。。。");
			}
			
		}
	}

}
