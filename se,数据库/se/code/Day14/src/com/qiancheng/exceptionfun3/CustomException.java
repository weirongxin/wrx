package com.qiancheng.exceptionfun3;
//����Զ����쳣�ĸ���ΪRuntimeException���Ǳ�������
//�������ΪException ��һ����Ҫ���
public class CustomException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CustomException(String message) {
		super(message);
	}

	
}
