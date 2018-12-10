package com.qiancheng.oop6;

public class Computer implements Socket{

	@Override
	public void getElectric() {
		System.out.println("电脑得到电....");
	}

	public void fun(int a){
		if(HOLE==a){
			System.out.println("通电。。。。");
		}
	}
}
