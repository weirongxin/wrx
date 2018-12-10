package com.qiancheng.work;

import java.util.Random;

//1 从0-9a-z之间随机出来五个字符组成新的字符串
//1) 该字符串不能重复  
//2) 求该字符串中数字的和
public class Work1 {

	public static void main(String[] args) {
		int count = 'z'-'a'+10+1;
		char[] source = new char[count];
		for(int i=0;i<count;i++){
			//前十个元素放 数字
			if(i<=9){
				char c = String.valueOf(i).charAt(0);
				source[i] = c;
			}else{
				//十个元素之后 存入字母
				int index = i-10;
				int letterNum = 'a'+index;
				char c = (char)letterNum;
				source[i] = c;
			}
		}
		//定义新字符串  存入随机的字符
		String newStr = new String();
		Random random = new Random();
		int sum = 0;
		for(int i=0;i<5;i++){
			//定义布尔 判断是否已经存在该字符
			boolean reRandom = true;
			String getStr = new String();
			while(reRandom){
				//随机数组下标
				int index = random.nextInt(source.length);
				//获取数组元素
				char getChar = source[index];
				getStr = String.valueOf(getChar);
				if(!newStr.contains(getStr)){
					reRandom = false;
					
					//判断当前字符是否为 数字类型
					if(Character.isDigit(getChar)){
						//数字类型 累加
						sum+=Integer.valueOf(getStr);
					}
				}
				
			}
			newStr = newStr.concat(getStr);
		}
		System.out.println("随机的字符串："+newStr+" 数字和："+sum);
	}

}
