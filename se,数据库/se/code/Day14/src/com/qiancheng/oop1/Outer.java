package com.qiancheng.oop1;

public class Outer {
	//1.成员内部类
	class Inner{
		private String name="inner Name";
		public void innerFunc(){
			System.out.println(name);
		}
	}
	//2.静态内部类
	static class StaticInner{
		private static String name = "static inner Name";
		public static void innerFunc(){
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		//1.成员内部类的调用，先实例化外部类 再通过外部类实例化内部类
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.innerFunc();
		//2.静态内部类的调用方法
		Outer.StaticInner.innerFunc();
		
		//3.局部内部类 定义
		class FuncInner{
			private String name  = "funInner Name";
			public void funInner(){
				System.out.println(name);
			}
		}
		//3.局部内部类的调用方法
		FuncInner funInner = new FuncInner();
		funInner.funInner();
	}
}
