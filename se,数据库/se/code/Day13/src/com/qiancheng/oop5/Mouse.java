package com.qiancheng.oop5;

public interface Mouse extends Usb,Electric{
	String LEFTKEY = "���";
	String RIGHTKEY = "�Ҽ�";
	
	void click();
	void doubleClick();
	void roll();
}
