package com.qiancheng.tools3;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		//���ܵ��ù��췽����ͨ���ṩ�ĵ����������������
		Calendar can = Calendar.getInstance();
		System.out.println(can);
		//����ָ�����ֶ� �޸�ʱ��
		can.add(Calendar.YEAR, 1);
		//����ָ�����ֶ� ��ȡʱ��
		int year = can.get(Calendar.YEAR);
		System.out.println(year);
	}

}
