package com.qiancheng.oop3;

public abstract class Animal {
	//�������ҽ��ܹ��� ��ÿ�����ﶼ��Ҫ���л�ʵ��
	//�ڵ�ǰ����ֻ��Ҫ�������������ɣ��������ܹ�������ʵ�֣�
	//�������û�з�����  ��Ҫ��abstract����Ϊ���󷽷�
	public abstract void say();
	public abstract void run();
	
	//��ǰ��������   ���Դ�����ͨ�ķ���
	public void eat(){
		System.out.println("eating....");
	}
	public void sleep(){
		System.out.println("sleep...");
	}
}
