package com.qiancheng.tools2;

public class User {

	//����ҵ���ǰ��������ڴ棬��Ĭ�ϵ���finalize���������л����ͷ�
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize");
		super.finalize();
	}

}
