package com.qiancheng.listfunc3;

import java.util.ArrayList;

import com.qiancheng.listfunc2.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("1");
		list.add(new Student());
		
		//���Ա� �����±�ɾ��Ԫ��
		list.remove(0);
		//�����±�  ������������µ�������
		list.set(0, "hello");
		
		for(Object obj:list){
			System.out.println(obj);
		}
	}

}
