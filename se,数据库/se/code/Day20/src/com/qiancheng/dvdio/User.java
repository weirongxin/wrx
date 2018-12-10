package com.qiancheng.dvdio;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
	public static Scanner scanner  = new Scanner(System.in);
	public DVDShop shop = new DVDShop();
	public static void main(String[] args) {
		System.out.println("��ӭʹ������DVD������");
		User user = new User();
		while(true){
			System.out.println("1.����DVD");
			System.out.println("2.�鿴DVD");
			System.out.println("3.ɾ��DVD");
			System.out.println("4.���DVD");
			System.out.println("5.�黹DVD");
			System.out.println("6.�˳�DVD");
			int sel = scanner.nextInt();
			switch (sel) {
			case 1:
				user.addNewDVD();
				break;
			case 2:
				user.lookAll();
				break;
			case 3:
				user.delDvd();
				break;
			case 4:
				user.borrowDvd();
				break;
			case 5:
				user.backDVD();
				break;
			case 6:
				user.outDVD();
				break;
			default:
				System.out.println("ѡ�����������ѡ��");
				break;
			}
		}		
	}
	public void addNewDVD(){
		System.out.println("��¼������DVD�����֣�");
		String dvdName = scanner.next();
		DVD dvd = new DVD(dvdName, "δ���", 1);
		shop.addDvd(dvd);
		System.out.println("����DVD�ɹ�");
	}
	public void lookAll(){
		System.out.println("���\t״̬\t����\t");
		//��������л�ȡdvd����
		ArrayList<DVD> dvds = shop.getDvds();
		//�����õ���dvd���ϣ�ÿ��Ԫ�ر�����ӡ
		for(int i = 0;i<dvds.size();i++){
			DVD d = dvds.get(i);
			System.out.println((i+1)+"\t"+d.getStatus()+"\t"+d.getName());
		}
	}
	//ɾ��dvd����
	public void delDvd(){
		System.out.println("��ѡ����Ҫɾ����DVD����ţ�");
		//��ʾ���е�dvd����
		lookAll();
		//¼����Ҫɾ�������
		int selectIndex = scanner.nextInt();
		//����������е�ɾ������ �жϽ���Ƿ��ǳɹ�ɾ��״̬
		boolean delStatus = shop.delDVD(selectIndex-1);
		if(delStatus){
			System.out.println("ɾ��DVD�ɹ�!");
		}else{
			System.out.println("ɾ��ʧ�ܣ�");
		}
	}
	//���DVD
	public void borrowDvd(){
		System.out.println("��¼����Ҫ���dvd����");
		String dvdName = scanner.next();
		//�������� ������꼯���и������ֻ�ȡdvd
		boolean status = shop.borrowDvd(new DVD(dvdName, "", 1));
		if(status){
			System.out.println("����ɹ���");
		}else{
			System.out.println("���ʧ�ܣ�");
		}
	}
	//�黹DVD
	public void backDVD(){
		System.out.println("������黹��DVD������");
		//¼��dvd������
		String dvdName = scanner.next();
		//��������귽��  �黹ָ�����ֵ�dvd
		boolean status = shop.backDVD(new DVD(dvdName, "", 1));
		if(status){
			System.out.println("�黹�ɹ���");
		}else{
			System.out.println("�黹ʧ�ܣ�");
		}
	}
	//�Ƴ�dvdϵͳ  �˳�֮ǰ��������ͬ�����ļ��� ���ݳ־û�
	public void outDVD(){
		shop.writeFile();
		System.exit(0);
	}
}
