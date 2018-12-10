package com.math.proxyfunc;

public class Test {

	public static void main(String[] args) {
		//功能类实例化
		Math math = new MathImpl();
		//代理类实例化
		MathProxy pro = new MathProxy(math);
		//从代理中获取功能代理对象
		Math mathFunc = pro.getMath();
		
		
		int sum = mathFunc.add(1, 2);
		System.out.println(sum);
		
	}

}
