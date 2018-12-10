package com.qiancheng.tools1;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.checkPhone("1a345678901"));

		System.out.println(t.checkPhoneByRegex("12345678901"));
	}
	//判断字符串是否是手机号 11位数字 以1开头
	public boolean checkPhoneByRegex(String phone){
		//使用正则 定义手机号验证的规则
		String regex = "[1][0-9]{10}";
		return phone.matches(regex);
	}
	//判断字符串是否是手机号 11位数字 以1开头
	public boolean checkPhone(String phone){
		//默认初始状态为true
		boolean status = true;
		//将手机号字符串 转换为字符数组
		char[] nums = phone.toCharArray();
		//判断长度是否为11位
		if(nums.length!=11){
			return false;
		}
		//遍历每个元素是否为数字类型的
		for(int i=0;i<nums.length;i++){
			//判断是否第一个元素为1
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
