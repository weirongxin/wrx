package com.qiancheng.sortfunc;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {

	public static void main(String[] args) {
		ArrayList lists = new ArrayList();
		lists.add( new Student(19));
		lists.add(new Student(20));
		lists.add(new Student(15));
		lists.add(new Student(5));
		lists.add(new Student(8));

		//�Լ����е�Ԫ�����򣬴���Ƚ��������� 
		Collections.sort(lists, new StudentCompare());
		
		System.out.println(lists);
	}

}
