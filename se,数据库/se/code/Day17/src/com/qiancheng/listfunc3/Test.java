package com.qiancheng.listfunc3;

import java.util.ArrayList;

import com.qiancheng.listfunc2.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("1");
		list.add(new Student());
		
		//线性表 按照下标删除元素
		list.remove(0);
		//根据下标  将参数对象更新到集合中
		list.set(0, "hello");
		
		for(Object obj:list){
			System.out.println(obj);
		}
	}

}
