package com.qiancheng.oop5;

public interface Usb {
	//�ӿ��е����� Ĭ��Ϊ����ֵ����������ʱ��д���η�
	public static final String num="2.0";
	String name = "usb";
	
	//�ڽӿ��ж��� ����������
	public abstract void insertFunc();
	//�ӿ��з���������  ����ʡ��abstract�ؼ���
	public void func2();
}
