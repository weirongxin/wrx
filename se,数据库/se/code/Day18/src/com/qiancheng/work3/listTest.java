package com.qiancheng.work3;

import java.util.ArrayList;
import java.util.List;
//如何去除List集合中的重复元素?
//		a,b,c,a,c,b,d,,,,,,
public class listTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(1);
		List l = removeDuplicate(list);
		System.out.println(l);
	}
	public static List removeDuplicate(List list){
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = list.size() -1; j > i; j--) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
				}
			}
		}
		return list;
	}
}
