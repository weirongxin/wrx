package com.homework1;

public class Test {

	public static void main(String[] args) {
		MyTime a=new MyTime(22,12,35);
		MyDate b=new MyDate(2002,7,30);
		FullTime c=new FullTime(a,b);
		System.out.println(c);
	}

}
