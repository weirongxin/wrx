package com.math.func;

public class MathImpl implements Math {
	private LogFunc func = new LogFunc();
	
	@Override
	public int add(int num1, int num2) {
		func.beforeLog();
		int sum = num1+num2;
		func.afterLog();
		return sum; 
	}

	@Override
	public int reduce(int num1, int num2) {
		return num1-num2;
	}

	@Override
	public int mul(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1/num2;
	}

}
