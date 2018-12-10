package com.qiancheng.tools3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		//1.默认无参构造
		Date date = new Date();
		System.out.println(date);
		//2.有参构造
		Date date2 = new Date(2018-1900, 6, 23);
		System.out.println(date2);
		
		Date date3 = new Date(2018-1900, 6, 22);
		System.out.println(date2.before(date3));
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒S毫秒");
		String timeStr = format.format(date3);
		System.out.println(timeStr);
	}

}
