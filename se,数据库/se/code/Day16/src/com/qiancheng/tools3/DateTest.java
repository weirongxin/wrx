package com.qiancheng.tools3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		//1.Ĭ���޲ι���
		Date date = new Date();
		System.out.println(date);
		//2.�вι���
		Date date2 = new Date(2018-1900, 6, 23);
		System.out.println(date2);
		
		Date date3 = new Date(2018-1900, 6, 22);
		System.out.println(date2.before(date3));
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��S����");
		String timeStr = format.format(date3);
		System.out.println(timeStr);
	}

}
