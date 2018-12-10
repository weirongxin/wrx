package com.qiancheng.tools1;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.checkPhone("1a345678901"));

		System.out.println(t.checkPhoneByRegex("12345678901"));
	}
	//�ж��ַ����Ƿ����ֻ��� 11λ���� ��1��ͷ
	public boolean checkPhoneByRegex(String phone){
		//ʹ������ �����ֻ�����֤�Ĺ���
		String regex = "[1][0-9]{10}";
		return phone.matches(regex);
	}
	//�ж��ַ����Ƿ����ֻ��� 11λ���� ��1��ͷ
	public boolean checkPhone(String phone){
		//Ĭ�ϳ�ʼ״̬Ϊtrue
		boolean status = true;
		//���ֻ����ַ��� ת��Ϊ�ַ�����
		char[] nums = phone.toCharArray();
		//�жϳ����Ƿ�Ϊ11λ
		if(nums.length!=11){
			return false;
		}
		//����ÿ��Ԫ���Ƿ�Ϊ�������͵�
		for(int i=0;i<nums.length;i++){
			//�ж��Ƿ��һ��Ԫ��Ϊ1
			if(i==0&&nums[i]!='1'){
				return false;
			}
			char num = nums[i];
			if(!Character.isDigit(num)){
				return false;
			}
		}
		return status;
	}

}
