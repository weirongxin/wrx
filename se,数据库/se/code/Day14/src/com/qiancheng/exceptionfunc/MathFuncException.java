package com.qiancheng.exceptionfunc;

public class MathFuncException {
		
	public class MathFuncException {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 0;
		MathFuncException math = new MathFuncException();
		int result = math.divd(num1, num2);
		System.out.println("�̣�" + result);
	}
		
	public int divd(int a, int b) {
		int result = 0;
		int[] nums = { 1, 2, 3 };
		// try ��� ��ӿ��ܻ������Ĵ���
		try {
			result = a / b;
			System.out.println(nums[5]);
			// catch�����쳣�Ĳ���catch������ ���ܳ��쳣���쳣����
			// ���Դ��ڶ��catch���
			// ���쳣��һ���ڸ��쳣��֮ǰcatch��
		} catch (ArithmeticException e) {
			System.out.println("�쳣����:	" + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�쳣����" + e);
		} catch (Exception e) {
			System.out.println("�쳣����" + e);
		} finally {
			System.out.println("finally..");
		}
		return result;
	}

}