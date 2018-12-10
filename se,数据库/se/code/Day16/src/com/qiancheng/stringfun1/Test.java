package com.qiancheng.stringfun1;

public class Test {

	public static void main(String[] args) {
		//1.String是不可更改的字符序列
		String str = "abc";
		str = "hello";
		//2.构造方法
		//String()  
		//String(byte[] bytes) 
		//String(char[] value) 
		//1）字符串类型 打印时默认直接打印内容
		String str2 = new String();
		System.out.println(str2);
		//2）将byte数组的元素通过 ascii码表 转换为相应的字符，拼接后生成字符串
		byte[] b = {67,68,69,70,71};
		String str3 = new String(b);
		System.out.println(str3);
		//3)通过字符数组构造字符串
		char[] c = {'a','b','c'};
		String str4 = new String(c);
		System.out.println(str4);
		
		
	}

}
