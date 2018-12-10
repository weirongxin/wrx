package com.qiancheng.listfunc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListFunc1 {

	public static void main(String[] args) {
		//1.集合对象的构造
		//引用类型的向上转型 多态  
		Collection listData =  new ArrayList();
		//2.添加功能
		//集合声明时 如果没有指定元素的数据类型，则可以添加Object的子类对象
		listData.add("hello");
		//参数：2为基本数据类型 ，自动装箱为包装类对象
		listData.add(2);
		listData.add(new Student());
		
		//3.删除功能
		listData.remove(2);
		//4.修改功能（删除原数据、新增修改后的数据）
		
		//5.增强for迭代集合
		for(Object obj:listData){
			System.out.println(obj);
		}
		
		//6.迭代器迭代集合元素
		//步骤1）从集合对象中获取迭代器对象
		//   2)使用迭代器判断是否存在下一个元素
		//   3)获取下一个元素
		Iterator iterator = listData.iterator();
		while(iterator.hasNext()){
			Object obj = iterator.next();
			System.out.println(obj);
		}

		//练习：集合中添加5个学生对象，学生对象的学号不同，遍历输出每个学生的学号
	}

}
