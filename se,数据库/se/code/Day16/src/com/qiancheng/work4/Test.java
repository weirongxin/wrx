package com.qiancheng.work4;
/*
 * ��дһ������������double���Ͷ�ά���飬
 * �����е�Ԫ��ͨ�������ַ���������á����ַ�������"1,2;3,4,5;6,7,8"
 ��Ӧ������Ϊ��
  d[0,0]=1.0 d[0,1] = 2.0
  d[1,0]=3.0 d[1,1]=4.0 d[1,2] =5.0
  d[2,0]=6.0 d[2,1]=7.0 d[2,2]=8.0
  
  "����,L����;��˼Զ,�����,��˷;�з���,����,�Ժ���"
 */
public class Test {	
	public static void main(String[] args) {
		String str = "����,L����;��˼Զ,�����,��˷;�з���,����,�Ժ���";
		//��;���ַ��� ���
		String[] groups = str.split(";");
		//����һά����ĳ��� ��������
		String[][] members = new String[groups.length][];
		for(int i=0;i<groups.length;i++){
			//ȡÿ�����ֵ��ַ���
			String s = groups[i];
			//��ÿ�����ֵ��ַ�����,���
			String[] member = s.split(",");
			//��ֵõ������Ա����  �����ά������
			members[i] = member;
		}
		
		for(String[] group:members){
			for(String member:group){
				System.out.print(member+"  ");
			}
			System.out.println();
		}
	}

}
