package com.qiancheng.setfun2;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		//�ַ����߱��ֵ�˳��
		TreeSet<String> set = new TreeSet<String>();
		set.add("d");
		set.add("abc");
		set.add("cc");
		//ȡ����Ԫ��Ϊ�Ѿ��ź�˳���
		for(String s:set){
			System.out.println(s);
		}
		
		TreeSet<Cat> catSet = new TreeSet<Cat>();
		catSet.add(new Cat(14));
		catSet.add(new Cat(13));
		
		for(Cat c:catSet){
			System.out.println(c);
		}
	}

}
