package com.qiancheng.setfun1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetFunc1 {

	public static void main(String[] args) {
		//Set接口中 HashSet的使用
		//1.无参构造创建set集合
		Set<String> data1 = new HashSet<String>();
		//2.add方法添加元素
		data1.add("xiaoming");
		data1.add("xiaohong");
		//3.迭代器迭代集合中的元素
		Iterator<String> iterator = data1.iterator();
		while(iterator.hasNext()){
			String data = iterator.next();
			//迭代过程中  通过迭代器删除数据
			if(data.equals("xiaoming")){
				iterator.remove();
			}
			System.out.println(data);
		}
		//4.删除集合中的元素（通过集合删除数据）
		data1.remove("xiaoming");
		//!!!迭代器迭代和集合删除不能混用
		for(String s:data1){
			System.out.println(s);
		}
	}

}
