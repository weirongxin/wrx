package com.qiancheng.thread1;

public class Test1 {

	public static void main(String[] args) {
		//1.MyThread�� Ϊ�Զ����߳��࣬ʵ�������̼�Ϊ �½��߳�
//		MyThread th = new MyThread();
		MyThread th = new MyThread("�����߳�");

		//2.���߳̿���������Ȩ�ޣ�ʹ�̴߳��ھ���״̬��
		//�߳��е�start����Ϊ�����̵߳���ڣ�ʹrun�еĺ�ʱ�����ܹ����߳���ִ��
		//ֱ��ͨ�������� ����run������Ϊ��ͨ�����ĵ��ã����漰���̲߳���
		th.start();
//		th.run();
		//ͨ���̶߳��� ���÷��� ��ȡ�̵߳�����
		String threadName = th.getName();
		System.out.println(threadName);
		
//		for(int i = 0;i<100;i++){
//			System.out.println(i);
//		}
		//���д�����λ�����߳���ִ�У����߳��еĴ�������߳��еĴ���û���Ⱥ�˳��ֻ�в��й�ϵ
		System.out.println("==========");
		
	}

}
