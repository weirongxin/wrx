package com.qiancheng.oop5;

public class USBMouse implements Usb,Mouse{
	
	public void insertFunc(){
		System.out.println("���֧���Ȱβ�");
	}
	public void func2(){
		System.out.println("����2");
	}
	//ʵ��Mouse�ӿ��еķ���
	public void click(){
		System.out.println("����");
	}
	public void doubleClick(){
		System.out.println("˫��");
	}
	public void roll(){
		System.out.println("����");
	}
}
