package com.qiancheng.stringfun1;

public class Test {

	public static void main(String[] args) {
		//1.String�ǲ��ɸ��ĵ��ַ�����
		String str = "abc";
		str = "hello";
		//2.���췽��
		//String()  
		//String(byte[] bytes) 
		//String(char[] value) 
		//1���ַ������� ��ӡʱĬ��ֱ�Ӵ�ӡ����
		String str2 = new String();
		System.out.println(str2);
		//2����byte�����Ԫ��ͨ�� ascii��� ת��Ϊ��Ӧ���ַ���ƴ�Ӻ������ַ���
		byte[] b = {67,68,69,70,71};
		String str3 = new String(b);
		System.out.println(str3);
		//3)ͨ���ַ����鹹���ַ���
		char[] c = {'a','b','c'};
		String str4 = new String(c);
		System.out.println(str4);
		
		
	}

}
