package com.qiancheng.tools;

public class Test1 {

	public static void main(String[] args) {
		ObjectHashCodeFunc obj1 = new ObjectHashCodeFunc(); 
		//实例化对象后  由于是Object的子类对象  所以可以直接调用hashCode方法
		int hashCode = obj1.hashCode();
		System.out.println(hashCode);
		
		ObjectHashCodeFunc obj2 = new ObjectHashCodeFunc(); 
		//实例化对象后  由于是Object的子类对象  所以可以直接调用hashCode方法
		int hashCode2 = obj2.hashCode();
		System.out.println(hashCode2);
		
		//equals方法 在Object类中 根据两个对象的地址进行比较
		boolean chargeStatus = obj1.equals(obj2);
		System.out.println(chargeStatus);
		
	}

}
