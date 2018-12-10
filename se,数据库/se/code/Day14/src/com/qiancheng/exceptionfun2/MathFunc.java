package com.qiancheng.exceptionfun2;

public class MathFunc {
	
	public void testFunc(){
		int r = 0;
		try{
			r = divdFunc(3, 2);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		System.out.println(r);
	}
	
	public int divdFunc(int num1,int num2) throws ArithmeticException{
		int result = 0;
		//throw new ArithmeticException();
		try{
			result = num1/num2;
		}catch(ArithmeticException e){
			throw e;
		}
		return result;
	}
}
