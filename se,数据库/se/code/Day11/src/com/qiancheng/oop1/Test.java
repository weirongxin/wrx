package com.qiancheng.oop1;

public class Test {

	public static void main(String[] args) {
//		Father f = new Father();
//		f.money = 1;
//		System.out.println(f.money);
//		f.earnMoney();
		/*
		//1.ͨ��������ʸ����Ա
		Son s = new Son();
		System.out.println(s.money);
		s.earnMoney();
		//�������ͨ������������ ��ȡ�����е�˽�г�Ա
		String fatherLike =  s.getLikes();
		System.out.println("����İ���"+fatherLike);
		*/
		//2.ͨ��������ʸ����Ա �� ��Ӹ����Ա
		SisterChild child = new SisterChild();
		System.out.println(child.money);
		System.out.println(child.sisterMoney); 
		//������Ҫͨ������������ ��ȡ���ࡢ��Ӹ����е�˽�г�Ա
		child.getLikes();
	}

}
