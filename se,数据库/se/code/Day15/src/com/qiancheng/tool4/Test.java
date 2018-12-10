package com.qiancheng.tool4;

public class Test {

	public static void main(String[] args) {
		byte num = (byte)1;
		Byte b = new Byte(num);
		Byte b2 = 3;
		
		byte result = (byte)(num+b);
		
		System.out.println(b);
	}

}
