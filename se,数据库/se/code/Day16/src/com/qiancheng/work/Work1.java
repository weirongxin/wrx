package com.qiancheng.work;

import java.util.Random;

//1 ��0-9a-z֮�������������ַ�����µ��ַ���
//1) ���ַ��������ظ�  
//2) ����ַ��������ֵĺ�
public class Work1 {

	public static void main(String[] args) {
		int count = 'z'-'a'+10+1;
		char[] source = new char[count];
		for(int i=0;i<count;i++){
			//ǰʮ��Ԫ�ط� ����
			if(i<=9){
				char c = String.valueOf(i).charAt(0);
				source[i] = c;
			}else{
				//ʮ��Ԫ��֮�� ������ĸ
				int index = i-10;
				int letterNum = 'a'+index;
				char c = (char)letterNum;
				source[i] = c;
			}
		}
		//�������ַ���  ����������ַ�
		String newStr = new String();
		Random random = new Random();
		int sum = 0;
		for(int i=0;i<5;i++){
			//���岼�� �ж��Ƿ��Ѿ����ڸ��ַ�
			boolean reRandom = true;
			String getStr = new String();
			while(reRandom){
				//��������±�
				int index = random.nextInt(source.length);
				//��ȡ����Ԫ��
				char getChar = source[index];
				getStr = String.valueOf(getChar);
				if(!newStr.contains(getStr)){
					reRandom = false;
					
					//�жϵ�ǰ�ַ��Ƿ�Ϊ ��������
					if(Character.isDigit(getChar)){
						//�������� �ۼ�
						sum+=Integer.valueOf(getStr);
					}
				}
				
			}
			newStr = newStr.concat(getStr);
		}
		System.out.println("������ַ�����"+newStr+" ���ֺͣ�"+sum);
	}

}
