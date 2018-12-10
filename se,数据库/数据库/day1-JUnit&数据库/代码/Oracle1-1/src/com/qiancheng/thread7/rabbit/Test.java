package com.qiancheng.thread7.rabbit;

public class Test {

	public static void main(String[] args) {
		Rabbit r = new Rabbit();
		Tortoise t = new Tortoise(r);
		
		System.out.println("开始比赛，Ready Go！");
		r.start();
		t.start();
	}

}
