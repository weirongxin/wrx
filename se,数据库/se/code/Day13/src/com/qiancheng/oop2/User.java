package com.qiancheng.oop2;
//����ģʽ  
//1)���췽��˽�л�
//2)������ǰ�� ��Ա
//3)ͨ��������������ȡ��ʵ��ʱ ����
public class User {
	private static User user; 
	private User(){}
	//�ڵ��ù��еķ���������ʱ�����ж��Ƿ��Ѿ������˶���
	//����Ѿ�������������ֱ�ӷ��ش�����ɵĶ���
	//û�д��� �����ȴ����ڷ���
	//��������ģʽ ���ܻ��ڶ���̲߳���ʱ�����������ͬʱ����
	//   �������ͬʱ���� �򴴽�ʵ������ ���ܻᱻ��ε���
	//   ����ǰ��������̰߳�ȫ�� synchronized��ȷ��һ��ֻ��һ���̵߳���
	public synchronized static User getInstance(){
		if(user==null){
			user = new User();
		}
		return user;
	}
}
