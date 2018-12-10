package com.qiancheng.work3;
//一个字符串中有多少个“b”
//一个字符串中，特定字符串出现的次数
//编写一个程序，输出字符串中的大写英文字母数，小写英文字母数以及非英文字母数
public class Test {

	public static void main(String[] args) {
		String str = "helloworldbbbbAAA+++";
		char[] chars = str.toCharArray();
		int count = 0;
		for(char c:chars){
			if(c=='b'){
				count++;
			}
		}
		System.out.println(count);
		
		//编写一个程序，输出字符串中的大写英文字母数，小写英文字母数以及非英文字母数
		int upperCount = 0;
		int lowerCount = 0;
		int count0 = 0;
		for(char c:chars){
			if(Character.isUpperCase(c)){
				upperCount++;
			}else if(Character.isLowerCase(c)){
				lowerCount++;
			}else{
				count0++;
			}
		}
		System.out.println("大写数："+upperCount
				+"小写数："+lowerCount+"非英文字母数"+count0);
	}

}
