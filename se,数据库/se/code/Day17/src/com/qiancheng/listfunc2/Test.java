package com.qiancheng.listfunc2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Collection students = new ArrayList();
		for(int i=0;i<5;i++){
			Student stu = new Student();
			stu.setId(i);
			students.add(stu);
		}
		
		Iterator iterator = students.iterator();
		while(iterator.hasNext()){
			//�����������е�Ԫ��
			Object obj = iterator.next();
			//��ӡ������϶���  ��Ĭ�ϵ���toString����
			System.out.println(obj);
			//�ж��Ƿ�Ϊѧ��������
			if(obj instanceof Student){
				//��������������ת�͡�����ʵ��������еķ���
				Student stu = (Student)obj;
				stu.say();
			}
		}

	}

}
