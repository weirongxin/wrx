package com.qiancheng.setfun1;

import java.util.HashSet;
import java.util.Set;

public class SetFunc2 {
	public static void main(String[] args) {
		Set<String> data1 = new HashSet<String>();
		data1.add("hello");
		data1.add("world");
		data1.add("hello");
		System.out.println(data1.size());
		//Set集合中的数据 不能重复 
		Set<Feng> data2 = new HashSet<Feng>();
		//存入对象时 本质存储的是地址
		data2.add(new Feng("feng1"));
		data2.add(new Feng("feng2"));
		data2.add(new Feng("feng3"));
		
		System.out.println(data2.size());
		//增强for遍历集合  
		for(Feng f:data2){
			System.out.println(f.name);
		}
	}

}
class Feng{
	String name;
	public Feng(String name){
		this.name = name;
	}
}