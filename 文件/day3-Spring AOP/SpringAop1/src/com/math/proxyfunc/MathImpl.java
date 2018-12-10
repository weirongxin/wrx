package com.math.proxyfunc;

public class MathImpl implements Math {
	 
	@Override
	public int add(int num1, int num2) {
 		int sum = num1+num2;
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
