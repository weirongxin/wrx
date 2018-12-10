package com.qiancheng.exceptionfun3;

public class Test {

	public static void main(String[] args) {
		int score = -10;
		if(score<0){
			throw new CustomException("成绩数据有误！");
		}
		
	}

}
