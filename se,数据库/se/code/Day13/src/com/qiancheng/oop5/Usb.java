package com.qiancheng.oop5;

public interface Usb {
	//接口中的属性 默认为常量值，可以声明时不写修饰符
	public static final String num="2.0";
	String name = "usb";
	
	//在接口中定义 方法的声明
	public abstract void insertFunc();
	//接口中方法的声明  可以省略abstract关键字
	public void func2();
}
