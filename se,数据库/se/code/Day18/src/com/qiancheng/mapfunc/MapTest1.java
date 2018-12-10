package com.qiancheng.mapfunc;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {
		Map<String,String> data = new HashMap<String,String>();
		//增加数据时  put方法添加一对数据key-value
		data.put("小明", "小红");
		data.put("杨过", "小龙女");
		data.put("郭靖", "黄蓉");
		data.put("李小璐", "贾乃亮");
		
		//取数据
		String name = data.get("李小璐");
		//System.out.println(name);
		//修改数据时和存入数据方式相同  key是唯一的
		data.put("李小璐", "PGOne");
		
		//删除数据
		data.remove("李小璐");
		
		System.out.println(data);
	}

}
