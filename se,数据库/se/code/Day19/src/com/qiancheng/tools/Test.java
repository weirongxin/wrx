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
		//1.�������з���  ��ת����Ԫ��
		Collections.reverse(lists);
		System.out.println(lists);
		//2.���Ҽ�����Ԫ�ص�˳��
		Collections.shuffle(lists);
		System.out.println(lists);
		//3.������2������ �滻ָ�������е�ÿ��Ԫ��
		Collections.fill(lists, null);
		System.out.println(lists);
	}

}
