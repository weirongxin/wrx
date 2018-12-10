package com.qiancheng.oop1;

public class Outer {
	//1.��Ա�ڲ���
	class Inner{
		private String name="inner Name";
		public void innerFunc(){
			System.out.println(name);
		}
	}
	//2.��̬�ڲ���
	static class StaticInner{
		private static String name = "static inner Name";
		public static void innerFunc(){
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		//1.��Ա�ڲ���ĵ��ã���ʵ�����ⲿ�� ��ͨ���ⲿ��ʵ�����ڲ���
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.innerFunc();
		//2.��̬�ڲ���ĵ��÷���
		Outer.StaticInner.innerFunc();
		
		//3.�ֲ��ڲ��� ����
		class FuncInner{
			private String name  = "funInner Name";
			public void funInner(){
				System.out.println(name);
			}
		}
		//3.�ֲ��ڲ���ĵ��÷���
		FuncInner funInner = new FuncInner();
		funInner.funInner();
	}
}
