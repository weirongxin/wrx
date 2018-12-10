package com.qiancheng.work1;
//2 求两个字符串中最大相同子串
//hahahlelelds
//hahahleldsdf
public class Work1 {
	public static void main(String[] args) {
		String a="hahahlelelds";
		String b="aaahahahleledsdf";
		String c=getSonString(a,b);
		System.out.println(c);
	}
	private static String getSonString(String a,String b) {
		//先定义两个字符串变量
		String max=null;
		String min=null;
		String temp="";
		//判断长度最大的为 最长子串
		if(a.length()>b.length()) {
			max=a;
			min=b;
		}else {
			max=b;
			min=a;
		}
		//循环小串长度
		for(int i=0;i<min.length();i++) {
			//
			for(int j=0;j<=i;j++) {
				String substring = min.substring(j, min.length()-i+j);
				if(max.contains(substring)) {
					if(temp.length()<substring.length()) {
						temp=substring;
					}
				}
			}
		}
		return temp;
	}

}
