package com.qiancheng.work1;

public class Work2 {
	public static void main(String[] args) {
		//��������Դ
		String str="18712001";
		//���嵥λ
		String[] currency={"��","ǧ","��","ʮ","��","ǧ","��","ʮ","Ԫ"};
		//������Դ�ַ��� ת��Ϊchar����
		char[] chars = str.toCharArray();
		//ȡ��λ�ĳ���
		int a = currency.length-str.length();

		StringBuffer moneyStr = new StringBuffer();
		//ѭ���������ֵ�ÿһ��  ���Ӹ�λ����ʼ����
		for(int i=0;i<=chars.length-1;i++){
			if(chars[i]=='0'){
				a++;
				if(!moneyStr.toString().endsWith("��")){
					moneyStr.append("��");
				}
				continue;
			}else if(chars[i]=='1'){
				moneyStr.append("һ");
			}else if(chars[i]=='2'){
				moneyStr.append("��");
			}else if(chars[i]=='3'){
				moneyStr.append("��");
			}else if(chars[i]=='4'){
				moneyStr.append("��");
			}else if(chars[i]=='5'){
				moneyStr.append("��");
			}else if(chars[i]=='6'){
				moneyStr.append("��");
			}else if(chars[i]=='7'){
				moneyStr.append("��");
			}else if(chars[i]=='8'){
				moneyStr.append("��");
			}else if(chars[i]=='9'){
				moneyStr.append("��");
			}
//			System.out.print(currency[a]);
			moneyStr.append(currency[a]);
			a++;
		}
		System.out.print(moneyStr);

	}
}
