package com.qiancheng.work1;

import java.util.HashMap;
import java.util.Scanner;

//Map�д�ŵ���ʫ����Ϣ��ģ�����ʫ�����ݿ⡣
//ʫ�ʣ�Poem�����֡����ߡ�����������
//ʫ�����ݿ���key��ʫ������  value��Poem����
//
//��toString������ ����������Ϣ���ַ�����
public class Test {
	public static void main(String[] args) {
		Poem p1 = new Poem("��ҹ˼", "���", "��", "��ǰ���¹�......");
		Poem p2 = new Poem("ӽ��", "�����", "��", "�죬�죬��......");
		Poem p3 = new Poem("ӽ��", "��֪��", "��", "����ױ��һ����......");
		
		HashMap<String, Poem> poems = new HashMap<String,Poem>();
		poems.put(p1.getName(), p1);
		poems.put(p2.getName(), p2);
		poems.put(p3.getName(), p3);
		//¼�����Ĵ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ӭ����ͼ���ʫ�ʲ���ϵͳ");
		
		boolean status = true;
		while(status){
			//��ѯ����
			System.out.println("��¼�����ʫ�ʵ����֣�");
			String queryPoemName = scanner.next();
			//��ѯ�õ�ʫ�����
			Poem getPoem = poems.get(queryPoemName);
			if(getPoem!=null){
				System.out.println("��ѯ����ʫ��:");
				System.out.println(getPoem.getName()+"  "+getPoem.getAuthor()+" "+getPoem.getDynasty());
				System.out.println(getPoem.getContent());
			}else{
				System.out.println("û�и�ʫ��");
			}
			
			System.out.println("�Ƿ���Ҫ������ѯ�� yes����  no������");
			String select = scanner.next();
			if(select.equals("no")){
				status = false;
				System.out.println("ллʹ�ã�");
			}
		}

		scanner.close();
	}

}
