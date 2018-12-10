package com.qiancheng.exceptionfunc;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t.func();
	}
	
	public void func(){
		int result  = divdFun(3, 0);
		System.out.println(result);
	}
	//«Û…Ã
	public int divdFun(int a,int b){
		int result = 0;
		try{
			result =  a/b;
			return result;
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("finally");
			//return 1;
		}
		return result;
	}

}
