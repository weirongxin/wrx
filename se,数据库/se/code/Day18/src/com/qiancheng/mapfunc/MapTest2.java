package com.qiancheng.mapfunc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String,String> data = new HashMap<String,String>();
		//��������ʱ  put�������һ������key-value
		data.put("С��", "С��");
		data.put("���", "С��Ů");
		data.put("����", "����");
		data.put("��С�", "������");
		//1.ȡ�ֵ������е�key����(�����ظ�)
		Set<String> keys = data.keySet();
		System.out.println(keys);
//		//2.ȡ�ֵ������е�value����(���ظ�)
		Collection<String> values = data.values();
		System.out.println(values);
		
		//3.entrySet ȡ�ֵ���һ��һ��������ɵļ���
		Set<Map.Entry<String,String>> value =data.entrySet();
		Iterator<Map.Entry<String,String>> i = value.iterator();
		while(i.hasNext()){
			Entry<String,String> en = i.next();
			System.out.println("key:"+en.getKey());
			System.out.println("value:"+en.getValue());
		}
	}

}
