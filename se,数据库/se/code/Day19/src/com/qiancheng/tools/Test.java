package com.qiancheng.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		lists.add("xiaoming");
		lists.add("xiaohong");
		lists.add("xiaohei");
		//1.工具类中方法  反转集合元素
		Collections.reverse(lists);
		System.out.println(lists);
		//2.打乱集合中元素的顺序
		Collections.shuffle(lists);
		System.out.println(lists);
		//3.将参数2的数据 替换指定集合中的每个元素
		Collections.fill(lists, null);
		System.out.println(lists);
	}

}
