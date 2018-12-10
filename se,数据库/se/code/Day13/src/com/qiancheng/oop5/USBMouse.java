package com.qiancheng.oop5;

public class USBMouse implements Usb,Mouse{
	
	public void insertFunc(){
		System.out.println("鼠标支持热拔插");
	}
	public void func2(){
		System.out.println("功能2");
	}
	//实现Mouse接口中的方法
	public void click(){
		System.out.println("单击");
	}
	public void doubleClick(){
		System.out.println("双击");
	}
	public void roll(){
		System.out.println("滚动");
	}
}
