package com.qiancheng.file;

import java.io.File;
/*
 * ��ϰ1.�ڱ����Ĵ���ϵͳ�У���һ���ļ��У�����File����ṩ�������г����ļ����е������ļ�

���ļ������ļ���·����ִ��Ч�����£�
·����xxx���ļ����ڵ��ļ��У�
�ļ�����abc.txt
·������c:\temp\abc.txt 
--------------------------------------------
�ļ�����def.txt
·������c:\temp\def.txt 
 */
public class FileFunc4 {

	public static void main(String[] args) {
		File file = new File("D:\\");
		File[] files =  file.listFiles();
		for(File f:files){
			System.out.println("�ļ�����"+f.getName());
			System.out.println("  �ļ�·����"+f.getAbsolutePath());
		}
	}

}
