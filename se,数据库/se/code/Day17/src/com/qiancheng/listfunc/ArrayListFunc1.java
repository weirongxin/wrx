package com.qiancheng.listfunc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListFunc1 {

	public static void main(String[] args) {
		//1.���϶���Ĺ���
		//�������͵�����ת�� ��̬  
		Collection listData =  new ArrayList();
		//2.��ӹ���
		//��������ʱ ���û��ָ��Ԫ�ص��������ͣ���������Object���������
		listData.add("hello");
		//������2Ϊ������������ ���Զ�װ��Ϊ��װ�����
		listData.add(2);
		listData.add(new Student());
		
		//3.ɾ������
		listData.remove(2);
		//4.�޸Ĺ��ܣ�ɾ��ԭ���ݡ������޸ĺ�����ݣ�
		
		//5.��ǿfor��������
		for(Object obj:listData){
			System.out.println(obj);
		}
		
		//6.��������������Ԫ��
		//����1���Ӽ��϶����л�ȡ����������
		//   2)ʹ�õ������ж��Ƿ������һ��Ԫ��
		//   3)��ȡ��һ��Ԫ��
		Iterator iterator = listData.iterator();
		while(iterator.hasNext()){
			Object obj = iterator.next();
			System.out.println(obj);
		}

		//��ϰ�����������5��ѧ������ѧ�������ѧ�Ų�ͬ���������ÿ��ѧ����ѧ��
	}

}
