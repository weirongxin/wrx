package com.qiancheng.thread2;

public class Test {
	public static void main(String[] args) {
		//�߳�ʵ�ֵ����ַ�ʽ��1.�̳���Thread��  2.ʵ��Runnable�ӿ�
		MyThread mh1 = new MyThread("С��");
		MyThread mh2 = new MyThread("С��");
		
		
		//1.��ʵ���� ʵ��Runnable�ӿڵ��̶߳���
		CustomThread ct = new CustomThread();
		//2.�����̶߳��󣬴���ct
		Thread th = new Thread(ct);
		th.setName("С��");
		
		
		CustomThread ct2 = new CustomThread();
		Thread th2 = new Thread(ct2);
		th2.setName("HanMeiMei");
		
		
		//�����̵߳����ȼ�
		mh1.setPriority(Thread.MAX_PRIORITY);
		th.setPriority(Thread.MIN_PRIORITY);
		
		mh1.start();
		mh2.start();
		th.start();
		th2.start();
		//��ȡ�̵߳ı�ʶ��
		long num1 = mh1.getId();
		System.out.println("�߳�1�ı�ʶ����"+num1);
		long num2 = mh2.getId();
		System.out.println("�߳�2�ı�ʶ����"+num2);
		long num3 = th.getId();
		System.out.println("�߳�3�ı�ʶ����"+num3);
		long num4 = th2.getId();
		System.out.println("�߳�4�ı�ʶ����"+num4);
	}
}
