package com.qiancheng.oop4;

public class Sister extends Father{
	private String gender;
	//���๹�췽��һ��ֻ�������๹��ĵ�һ�е���
	public Sister(String name){
		//super();
		super(name);
		System.out.println("sister �� �޲ι���");
		this.gender = "F";
		this.say();
	}
	//������� Ĭ���޲ι���û��ʵ�֡�ʵ�����вι���
	//��  ������Ĭ�ϵ��� ���๹�촦���ᱨ��
//	public Sister(){
//		
//	}
	
	public void say(){
		System.out.println("say");
	}
}
