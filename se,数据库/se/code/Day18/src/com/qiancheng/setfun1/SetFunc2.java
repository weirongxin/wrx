package com.qiancheng.setfun1;

import java.util.HashSet;
import java.util.Set;

public class SetFunc2 {
	public static void main(String[] args) {
		Set<String> data1 = new HashSet<String>();
		data1.add("hello");
		data1.add("world");
		data1.add("hello");
		System.out.println(data1.size());
		//Set�����е����� �����ظ� 
		Set<Feng> data2 = new HashSet<Feng>();
		//�������ʱ ���ʴ洢���ǵ�ַ
		data2.add(new Feng("feng1"));
		data2.add(new Feng("feng2"));
		data2.add(new Feng("feng3"));
		
		System.out.println(data2.size());
		//��ǿfor��������  
		for(Feng f:data2){
			System.out.println(f.name);
		}
	}

}
class Feng{
	String name;
	public Feng(String name){
		this.name = name;
	}
}