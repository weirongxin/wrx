package com.qiancheng.tools2;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person(123);
		Person p2 = new Person(123);
		
		System.out.println(p1);
		System.out.println(p2);
		
		//��������ͨ��equals�����Ƚ�(Ĭ�ϱȽϵ�ַ)
		if(p1.equals(p2)){
			System.out.println("��ͬ��һ����");
		}else{
			System.out.println("��ͬ����");
		}
	}

}
