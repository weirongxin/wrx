package com.wanghua.dvd;

public class TitleInformation {
	/**
	 * Ӱ���� ��ӡ������Ϣ
	 */
	public void showTitle(){
		System.out.println("��ӭʹ������DVD������");
		System.out.println("-------------------------");
		System.out.println("1.����DVD");
		System.out.println("2.�鿴DVD");
		System.out.println("3.ɾ��DVD");
		System.out.println("4.���DVD");
		System.out.println("5.�黹DVD");
		System.out.println("6.�˳�DVD");
		System.out.println("-------------------------");
	}
	public void showDvdInfo(DVD[] dvds) {
		System.out.println("���\t״̬\t����\t\t�������\t�������");
		for(int n = 0;n<dvds.length;n++) {
			DVD d = dvds[n];
			if(d == null)
				break;
			System.out.print(n+1);
			System.out.print("\t"+d.getState());
			System.out.print("\t"+d.getName());
			System.out.print("\t\t"+d.getDate());
			System.out.print("\t"+d.getCount());
			System.out.println("");
		}
		System.out.println("**************************");
	}
	/**
	 * ����ѡ����ʾ��Ϣ
	 */
	public void showInputTitle(){
		System.out.print("��ѡ��");
	}
	/**
	 * ������0���ء���ʾ��Ϣ
	 */
	public void showBackInitTitle(){
		System.out.print("����0����");
	}
	/**
	 * ����DVD��ʾ��Ϣ
	 */
	public void showAddTitle(){
		System.out.println("-->����DVD");
		System.out.println("**************************");
		System.out.println("����������DVD������");
	}
	/**
	 * �鿴DVD��ʾ��Ϣ
	 */
	public void showLookTitle(){
		System.out.println("-->�鿴DVD");
		System.out.println("**************************");
	}
	/**
	 * ɾ��DVD��ʾ��Ϣ
	 */
	public void showDelTitle(){
		System.out.println("-->ɾ��DVD");
		System.out.println("**************************");
		System.out.println("������ɾ��DVD������");
	}
	/**
	 * ���DVD��ʾ��Ϣ
	 */
	public void showBorrowTitle(){
		System.out.println("-->���DVD");
		System.out.println("**************************");
		System.out.println("��������DVD������");
	}
	/**
	 * �黹DVD��ʾ��Ϣ
	 */
	public void showBackTitle(){
		System.out.println("-->�黹DVD");
		System.out.println("**************************");
		System.out.println("������黹DVD������");
	}
	/**
	 * �����ɹ�
	 */
	public void addDvdSuccess(String name){
		System.out.println("����DVD"+name+"�ɹ�");
		System.out.println("**************************");
	}
	/**
	 * ����ʧ�� �Ѿ����ڸ�dvd
	 */
	public void exitDvdFailed(String name){
		System.out.println("����DVD"+name+"ʧ�ܣ��Ѿ����ڸ�DVD");
		System.out.println("**************************");
	}
	/**
	 * ����ʧ�� �ֿ�����
	 */
	public void exitDvdOver(String name){
		System.out.println("����DVD"+name+"ʧ�ܣ� �ֿ�����");
		System.out.println("**************************");
	}
	/**
	 * ����ʧ����ʾ
	 */
	public void inputError(){
		System.out.println("����ʧ�ܣ�����������");
	}
	/**
	 * ���ڽ������ɾ��
	 */
	public void delError(){
		System.out.println("���ڽ�� ����ɾ��");
	}
	/**
	 * ɾ���ɹ�
	 */
	public void delSuccess(){
		System.out.println("ɾ���ɹ�");
	}
	/**
	 * �Ѿ����
	 */
	public void borrowError(){
		System.out.println("���ʧ��");
	}
	/**
	 * ����ɹ�
	 */
	public void borrowSucccess(){
		System.out.println("����ɹ�");
	}
	/**
	 * �黹ʧ��
	 */
	public void backError(){
		System.out.println("�黹ʧ��");
	}
	/**
	 * �黹�ɹ�
	 */
	public void backSucccess(){
		System.out.println("�黹�ɹ�");
	}
}
