package com.qiancheng.tools;

public class ObjectHashCodeFunc {

	//��ǰ����Ϊ�Ը��� ��������д
	//��������� super�Ĺ�ϣ�㷨����ǰ������ж����ϣֵ��ȡ��Ϊͬһ��ֵ
	@Override
	public int hashCode() {
		String name = "xiaoming";
		return name.hashCode();//super.hashCode();
	}
	
}
