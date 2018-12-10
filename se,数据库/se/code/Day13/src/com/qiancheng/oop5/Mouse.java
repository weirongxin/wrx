package com.qiancheng.oop5;

public interface Mouse extends Usb,Electric{
	String LEFTKEY = "×ó¼ü";
	String RIGHTKEY = "ÓÒ¼ü";
	
	void click();
	void doubleClick();
	void roll();
}
