package com.qiancheng.setfun2;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		//字符串具备字典顺序
		TreeSet<String> set = new TreeSet<String>();
		set.add("d");
		set.add("abc");
		set.add("cc");
		//取出的元素为已经排好顺序的
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
