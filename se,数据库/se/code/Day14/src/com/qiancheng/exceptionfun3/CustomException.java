package com.qiancheng.exceptionfun3;
//如果自定义异常的父类为RuntimeException则不是必须解决的
//如果父类为Exception 则一定需要解决
public class CustomException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CustomException(String message) {
		super(message);
	}

	
}
