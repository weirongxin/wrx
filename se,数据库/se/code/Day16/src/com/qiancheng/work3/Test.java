package com.qiancheng.work3;
//һ���ַ������ж��ٸ���b��
//һ���ַ����У��ض��ַ������ֵĴ���
//��дһ����������ַ����еĴ�дӢ����ĸ����СдӢ����ĸ���Լ���Ӣ����ĸ��
public class Test {

	public static void main(String[] args) {
		String str = "helloworldbbbbAAA+++";
		char[] chars = str.toCharArray();
		int count = 0;
		for(char c:chars){
			if(c=='b'){
				count++;
			}
		}
		System.out.println(count);
		
		//��дһ����������ַ����еĴ�дӢ����ĸ����СдӢ����ĸ���Լ���Ӣ����ĸ��
		int upperCount = 0;
		int lowerCount = 0;
		int count0 = 0;
		for(char c:chars){
			if(Character.isUpperCase(c)){
				upperCount++;
			}else if(Character.isLowerCase(c)){
				lowerCount++;
			}else{
				count0++;
			}
		}
		System.out.println("��д����"+upperCount
				+"Сд����"+lowerCount+"��Ӣ����ĸ��"+count0);
	}

}
