package com.qiancheng.thread1;

public class Test1 {

	public static void main(String[] args) {
		//1.MyThread类 为自定义线程类，实例化过程即为 新建线程
//		MyThread th = new MyThread();
		MyThread th = new MyThread("下载线程");

		//2.将线程开启、分配权限（使线程处于就绪状态）
		//线程中的start方法为开启线程的入口，使run中的耗时操作能够在线程中执行
		//直接通过对象名 调用run方法，为普通方法的调用，不涉及到线程操作
		th.start();
//		th.run();
		//通过线程对象 调用方法 获取线程的名字
		String threadName = th.getName();
		System.out.println(threadName);
		
//		for(int i = 0;i<100;i++){
//			System.out.println(i);
//		}
		//该行代码仍位于主线程中执行，子线程中的代码和主线程中的代码没有先后顺序，只有并列关系
		System.out.println("==========");
		
	}

}
