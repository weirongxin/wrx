package com.qiancheng.work1;
//2 �������ַ����������ͬ�Ӵ�
//hahahlelelds
//hahahleldsdf
public class Work1 {
	public static void main(String[] args) {
		String a="hahahlelelds";
		String b="aaahahahleledsdf";
		String c=getSonString(a,b);
		System.out.println(c);
	}
	private static String getSonString(String a,String b) {
		//�ȶ��������ַ�������
		String max=null;
		String min=null;
		String temp="";
		//�жϳ�������Ϊ ��Ӵ�
		if(a.length()>b.length()) {
			max=a;
			min=b;
		}else {
			max=b;
			min=a;
		}
		//ѭ��С������
		for(int i=0;i<min.length();i++) {
			//
			for(int j=0;j<=i;j++) {
				String substring = min.substring(j, min.length()-i+j);
				if(max.contains(substring)) {
					if(temp.length()<substring.length()) {
						temp=substring;
					}
				}
			}
		}
		return temp;
	}

}
