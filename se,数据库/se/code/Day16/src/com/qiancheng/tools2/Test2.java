package com.qiancheng.tools2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User();
		//��u������Ϊnull �����������ڴ�
		u=null;
		//�ֶ���������������
		System.gc();
		
		System.out.println("-----");
	}

}
