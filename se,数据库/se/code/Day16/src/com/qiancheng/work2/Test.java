package com.qiancheng.work2;

public class Test {

	public static void main(String[] args) {
		Tiger t = new Tiger(300.0F, "大王", 200);
		Pig p = new Pig(300.0F, "大王", 200);
		System.out.println(p.equals(t));
		System.out.println(t.equals(p));
	}

}
