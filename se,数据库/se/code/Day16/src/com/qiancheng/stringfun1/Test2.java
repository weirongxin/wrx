package com.qiancheng.stringfun1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test2 {

	public static void main(String[] args) {
		//1.  char charAt(int index) 返回指定索引处的 char 值。 
		// 根据索引 获取指定字符
		String str1 = "helloworld";
		char c = str1.charAt(5);
		System.out.println(c);
		
		//2.int compareTo(String anotherString) 
		//字符串中的每个字符互相比较
		//如果相同位置 结果为0，比参数小 返回值为<0  比参数大返回值>0
		//compareToIgnoreCase 字符串比较(忽略大小写)
		String str2 = "aabb";
		String str3 = "aacc";
		int result = str2.compareTo(str3);
		System.out.println(result);
		
		//3.String concat(String str) 将指定字符串连接到此字符串的结尾。 
		String str4 = "he";
		String str5 = str4.concat("lloWorld");
		System.out.println(str5);
		
		//4.boolean contains(CharSequence s) 
		String str6 = "xiaoming";
		boolean b1 = str6.contains("ixao");
		System.out.println(b1);
		
		//5. boolean endsWith(String suffix)  测试此字符串是否以指定的后缀结束。 
		String str7 = "xiaoming.txt";
		System.out.println(str7.endsWith("txt"));
		
		//6. boolean equals(Object anObject) 
		//boolean equalsIgnoreCase(String anotherString) 
		String str8 = "xiaoming";
		String str9 = "XiaoMing";
		boolean b2 = str8.equals(str9);
		boolean b3 = str8.equalsIgnoreCase(str9);
		System.out.println(b2);
		System.out.println(b3);
		
		//7.static String format(String format, Object... args) 
		//使用指定的格式字符串和参数返回一个格式化字符串。 
		Calendar calendar = Calendar.getInstance();
		String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", calendar);
		System.out.println(s);
		
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 hh时 mm分 ss秒 S毫秒");
		String dateStr = format.format(d);
		System.out.println(dateStr);
		
		//8. int indexOf(int ch) 返回指定字符在此字符串中第一次出现处的索引。 
		String str10 = "xiaoming";
		int index = str10.indexOf('m');
		System.out.println(index);
		
		//9. String replace(char oldChar, char newChar) 
		//String replace(CharSequence target, CharSequence replacement) 
		//String replaceAll(String regex, String replacement) 
		//String replaceFirst(String regex, String replacement) 
		String str11 = "金三胖来华访问";
		String str12 = str11.replaceAll("金三胖", "***");
		System.out.println(str12);
		
		//10. String[] split(String regex) 根据给定正则表达式的匹配拆分此字符串。 
		String str13 = "来华访问的是金三胖，过了两天金三胖又走了 ";
		String[] strs = str13.split("金三胖");
		for(String ss:strs){
			System.out.println(ss);
		}
		
		String s0 = "3.14D";
		Float ff = new Float(s0);
		System.out.println(ff);
		
	}

}
