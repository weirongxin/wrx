package com.qiancheng.sortfunc;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList nums = new ArrayList();
		//数字具有可比较性
//		nums.add(3);
//		nums.add(4);
//		nums.add(1);
//		nums.add(2);
		
		//字母具备可比较性（有字典顺序）
//		nums.add("abc");
//		nums.add("aa");
//		nums.add("oo");
//		nums.add("a");
		
		nums.add(new Student(19));
		nums.add(new Student(8));
		nums.add(new Student(20));
		nums.add(new Student(9));
		
		//调用collections工具类中的排序方法 ，对集合排序
		Collections.sort(nums);
		
		System.out.println(nums);
	}

}
