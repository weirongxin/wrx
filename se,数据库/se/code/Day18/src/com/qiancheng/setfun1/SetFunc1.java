package com.qiancheng.setfun1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetFunc1 {

	public static void main(String[] args) {
		//Set�ӿ��� HashSet��ʹ��
		//1.�޲ι��촴��set����
		Set<String> data1 = new HashSet<String>();
		//2.add�������Ԫ��
		data1.add("xiaoming");
		data1.add("xiaohong");
		//3.���������������е�Ԫ��
		Iterator<String> iterator = data1.iterator();
		while(iterator.hasNext()){
			String data = iterator.next();
			//����������  ͨ��������ɾ������
			if(data.equals("xiaoming")){
				iterator.remove();
			}
			System.out.println(data);
		}
		//4.ɾ�������е�Ԫ�أ�ͨ������ɾ�����ݣ�
		data1.remove("xiaoming");
		//!!!�����������ͼ���ɾ�����ܻ���
		for(String s:data1){
			System.out.println(s);
		}
	}

}
