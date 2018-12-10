package com.qiancheng.stringfun1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test2 {

	public static void main(String[] args) {
		//1.  char charAt(int index) ����ָ���������� char ֵ�� 
		// �������� ��ȡָ���ַ�
		String str1 = "helloworld";
		char c = str1.charAt(5);
		System.out.println(c);
		
		//2.int compareTo(String anotherString) 
		//�ַ����е�ÿ���ַ�����Ƚ�
		//�����ͬλ�� ���Ϊ0���Ȳ���С ����ֵΪ<0  �Ȳ����󷵻�ֵ>0
		//compareToIgnoreCase �ַ����Ƚ�(���Դ�Сд)
		String str2 = "aabb";
		String str3 = "aacc";
		int result = str2.compareTo(str3);
		System.out.println(result);
		
		//3.String concat(String str) ��ָ���ַ������ӵ����ַ����Ľ�β�� 
		String str4 = "he";
		String str5 = str4.concat("lloWorld");
		System.out.println(str5);
		
		//4.boolean contains(CharSequence s) 
		String str6 = "xiaoming";
		boolean b1 = str6.contains("ixao");
		System.out.println(b1);
		
		//5. boolean endsWith(String suffix)  ���Դ��ַ����Ƿ���ָ���ĺ�׺������ 
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
		//ʹ��ָ���ĸ�ʽ�ַ����Ͳ�������һ����ʽ���ַ����� 
		Calendar calendar = Calendar.getInstance();
		String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", calendar);
		System.out.println(s);
		
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy��MM��dd�� hhʱ mm�� ss�� S����");
		String dateStr = format.format(d);
		System.out.println(dateStr);
		
		//8. int indexOf(int ch) ����ָ���ַ��ڴ��ַ����е�һ�γ��ִ��������� 
		String str10 = "xiaoming";
		int index = str10.indexOf('m');
		System.out.println(index);
		
		//9. String replace(char oldChar, char newChar) 
		//String replace(CharSequence target, CharSequence replacement) 
		//String replaceAll(String regex, String replacement) 
		//String replaceFirst(String regex, String replacement) 
		String str11 = "��������������";
		String str12 = str11.replaceAll("������", "***");
		System.out.println(str12);
		
		//10. String[] split(String regex) ���ݸ���������ʽ��ƥ���ִ��ַ����� 
		String str13 = "�������ʵ��ǽ����֣�������������������� ";
		String[] strs = str13.split("������");
		for(String ss:strs){
			System.out.println(ss);
		}
		
		String s0 = "3.14D";
		Float ff = new Float(s0);
		System.out.println(ff);
		
	}

}
