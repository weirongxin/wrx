package com.math.func;

public class Test {

	public static void main(String[] args) {
		//实例化算数运算类
		Math math = new MathImpl();
		//实例化日志功能类
		LogFunc logFun = new LogFunc();
		
		//功能前日志处理
		logFun.beforeLog();
		//功能调用
		math.add(1, 1);
		//功能后日志处理
		logFun.afterLog();

	}

}
