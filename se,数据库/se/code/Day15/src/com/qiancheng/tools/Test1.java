package com.qiancheng.tools;

public class Test1 {

	public static void main(String[] args) {
		ObjectHashCodeFunc obj1 = new ObjectHashCodeFunc(); 
		//ʵ���������  ������Object���������  ���Կ���ֱ�ӵ���hashCode����
		int hashCode = obj1.hashCode();
		System.out.println(hashCode);
		
		ObjectHashCodeFunc obj2 = new ObjectHashCodeFunc(); 
		//ʵ���������  ������Object���������  ���Կ���ֱ�ӵ���hashCode����
		int hashCode2 = obj2.hashCode();
		System.out.println(hashCode2);
		
		//equals���� ��Object���� ������������ĵ�ַ���бȽ�
		boolean chargeStatus = obj1.equals(obj2);
		System.out.println(chargeStatus);
		
	}

}
