package com.qiancheng.mapfunc;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {
		Map<String,String> data = new HashMap<String,String>();
		//��������ʱ  put�������һ������key-value
		data.put("С��", "С��");
		data.put("���", "С��Ů");
		data.put("����", "����");
		data.put("��С�", "������");
		
		//ȡ����
		String name = data.get("��С�");
		//System.out.println(name);
		//�޸�����ʱ�ʹ������ݷ�ʽ��ͬ  key��Ψһ��
		data.put("��С�", "PGOne");
		
		//ɾ������
		data.remove("��С�");
		
		System.out.println(data);
	}

}
