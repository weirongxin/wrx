package com.qiancheng.tools3;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		//不能调用构造方法，通过提供的的如果访问日历对象
		Calendar can = Calendar.getInstance();
		System.out.println(can);
		//根据指定的字段 修改时间
		can.add(Calendar.YEAR, 1);
		//根据指定的字段 获取时间
		int year = can.get(Calendar.YEAR);
		System.out.println(year);
	}

}
