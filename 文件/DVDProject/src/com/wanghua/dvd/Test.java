package com.wanghua.dvd;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//�û�¼��
		Scanner scan = new Scanner(System.in);
		//�����ͱ���exit  �Ƿ� �˳���ǰDVDϵͳ ���û�¼��6ʱ ��
		boolean exit = false;
		
		//ʵ���� ��ʾ��Ϣ����
		TitleInformation info = new TitleInformation();
		//ʵ�����û�����
		User user = new User();
		
		while(!exit){
			//�����ͱ���selectFun  �Ƿ�ص���ʼѡ����״̬
			boolean selectFun = false;
			do{
				
				//��ʾ ����껶ӭ������ѡ����ʾ��Ϣ
				info.showTitle();
				//��ʾ�û����� ѡ��
				info.showInputTitle();
				
				//�û����빦��ѡ��
				int userSelect = scan.nextInt();
				//�����û�¼�빦��ѡ�� ������Ӧ����
				int status = user.userSelectStatus(userSelect);
				
				//�û����빦�� ���� 1-6��Χ�� 
				if(status ==0){
					selectFun = true;
				//�û�����6  ��Ҫ �˳���ǰDVDϵͳ
				}else if(status == -1){
					exit = true;
					break;
				}else{
				//�û����빦����1-5֮��  ������������  ����к����Ĳ�������
					if(userSelect == 2){
						user.showDVDListInfo();
						//����0 ����
						backInit(info,scan);
					}else{
						String dvdName = scan.next();
						user.userSelectFunc(userSelect, dvdName);
						//����0 ����
						backInit(info,scan);
					}
					selectFun = true;
				}
			}while(selectFun);
			
		}
		
		scan.close();
	}
	/**
	 * ����0 ����
	 * @param info
	 * @param scan
	 */
	public static  void backInit(TitleInformation info,Scanner scan){
		//����0����
		boolean back = false;
		while(!back) {
			info.showBackInitTitle();
			int n = scan.nextInt();
			if(n==0) {
				back = true;
			}
		}
	}
}
