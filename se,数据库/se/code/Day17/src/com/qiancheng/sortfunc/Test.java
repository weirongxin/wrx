package com.qiancheng.sortfunc;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList nums = new ArrayList();
		//���־��пɱȽ���
//		nums.add(3);
//		nums.add(4);
//		nums.add(1);
//		nums.add(2);
		
		//��ĸ�߱��ɱȽ��ԣ����ֵ�˳��
//		nums.add("abc");
//		nums.add("aa");
//		nums.add("oo");
//		nums.add("a");
		
		nums.add(new Student(19));
		nums.add(new Student(8));
		nums.add(new Student(20));
		nums.add(new Student(9));
		
		//����collections�������е����򷽷� ���Լ�������
		Collections.sort(nums);
		
		System.out.println(nums);
	}

}
