package com.qiancheng.mapfunc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String,String> data = new HashMap<String,String>();
		//增加数据时  put方法添加一对数据key-value
		data.put("小明", "小红");
		data.put("杨过", "小龙女");
		data.put("郭靖", "黄蓉");
		data.put("李小璐", "贾乃亮");
		//1.取字典中所有的key数据(不可重复)
		Set<String> keys = data.keySet();
		System.out.println(keys);
//		//2.取字典中所有的value数据(可重复)
		Collection<String> values = data.values();
		System.out.println(values);
		
		//3.entrySet 取字典中一对一对数据组成的集合
		Set<Map.Entry<String,String>> value =data.entrySet();
		Iterator<Map.Entry<String,String>> i = value.iterator();
		while(i.hasNext()){
			Entry<String,String> en = i.next();
			System.out.println("key:"+en.getKey());
			System.out.println("value:"+en.getValue());
		}
	}

}
