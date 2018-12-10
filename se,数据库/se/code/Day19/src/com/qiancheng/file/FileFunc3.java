package com.qiancheng.file;

import java.io.File;
import java.io.FileFilter;

public class FileFunc3 {

	public static void main(String[] args) {
		File[] txtFile =  FileFunc3.getTxtFile(new File("D:\\1803File"));
		for(File ff : txtFile){
			System.out.println(ff);
		}
	}
	//�������ļ�    �Ȼ�ȡ���е����ļ�����ɸѡ��txt���ļ�
	//File[] listFiles(FileFilter filter) 
	public static File[] getTxtFile(File file){
		File[] files = null;
		files = file.listFiles(new FileFilter(){

			//�ļ������� �ӿ��еķ���
			//�ļ���ȡ�Ĺ����У�ÿ���ļ�������accpet�����ж��Ƿ���ϣ����ϴ�����������
			@Override
			public boolean accept(File pathname) {
				if(pathname.getName().endsWith("txt")){
					return true;
				}
				return false;
			}
			
		});
		
		return files;	
	}
}
