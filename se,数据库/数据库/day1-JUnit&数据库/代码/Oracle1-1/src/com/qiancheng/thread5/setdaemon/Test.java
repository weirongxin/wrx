package com.qiancheng.thread5.setdaemon;

public class Test {

	public static void main(String[] args) {
		MyThread th = new MyThread("����");
		MyThread th1 = new MyThread("�ŷ�");
		MyThread th2 = new MyThread("����");
		MyThread th3 = new MyThread("����");
		//����  �ػ��߳�    ���δ������Ϊ���ػ����߳�
		//���ػ����̣߳����ȫ���������ػ��߳�����
		th1.setDaemon(true);
		th2.setDaemon(true);
		th3.setDaemon(true);
		
		th.start();
		th1.start();
		th2.start();
		th3.start();
	}

}
