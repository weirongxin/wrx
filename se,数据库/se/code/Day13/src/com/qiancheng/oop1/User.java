package com.qiancheng.oop1;
//����ģʽ
public class User {
	//2)User�еĵ��� Ψһ���󣬲���ֱ�ӱ��������
	//���ͨ���������õ�ǰ����ʵ������һ����Ҫ��static����Ϊ��̬��Ա
	private static User user = new User();
	
	//1)˽�й��췽��
	private User(){}
	
	//3)��ȡ˽������ʱ��ͨ�����public���εķ�����ȡ��Ա
	public static User getInstance(){
		return user;
	}
}
