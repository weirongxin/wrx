package com.qiancheng.file;

import java.io.File;

public class FileFunc1 {

	public static void main(String[] args) {
		//1.�����ַ��������ļ�·��
//		String filePath = "D:\\1803File\\file1.txt";
//		String filePath = "file\\file1.txt";
		String filePath = "D:\\1803File";

		//2.�����ַ���·�� �����ļ�����
		File file = new File(filePath);
		System.out.println(file);
		//3.��ȡ�ļ������а������ļ�����
		System.out.println("�ļ��Ƿ��ִ��"+file.canExecute());
		System.out.println("�ļ��Ƿ�ɶ�"+file.canRead());
		System.out.println("�ļ��Ƿ������ص�"+file.isHidden());
		//���·�� ָ��Ե�ǰ�������ڵ�λ��
		//����·�� ָ�ļ����ڴ���Ŀ¼λ��
		System.out.println("�ļ��ľ���·��"+file.getAbsolutePath());
		
		//4.��ȡ��ǰλ�����е����ļ�
		String[] files =  file.list();
		for(String str:files){
			System.out.println(str);
		}
	}

}
