package com.qiancheng.exceptionfunc;

public class MathFuncException {
		
	public class MathFuncException {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 0;
		MathFuncException math = new MathFuncException();
		int result = math.divd(num1, num2);
		System.out.println("商：" + result);
	}
		
	public int divd(int a, int b) {
		int result = 0;
		int[] nums = { 1, 2, 3 };
		// try 语句 添加可能会出问题的代码
		try {
			result = a / b;
			System.out.println(nums[5]);
			// catch进行异常的捕获，catch后声明 可能出异常的异常类型
			// 可以存在多个catch语句
			// 子异常类一定在父异常类之前catch中
		} catch (ArithmeticException e) {
			System.out.println("异常对象:	" + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("异常对象；" + e);
		} catch (Exception e) {
			System.out.println("异常对象：" + e);
		} finally {
			System.out.println("finally..");
		}
		return result;
	}

}