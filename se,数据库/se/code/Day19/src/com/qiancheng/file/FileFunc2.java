package com.qiancheng.file;

import java.io.File;
import java.io.IOException;

public class FileFunc2 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\1803File\\file2.txt");
		//�޸��ļ�����  ���·����ͬ ��Ϊ�޸��ļ������֣�·����ͬΪ�޸ĺ���С�ճ��
		boolean status =  file.renameTo(new File("D:\\file2.txt"));
		System.out.println(status);
		
		FileFunc2 t = new FileFunc2();
		t.delFunc();
	}
	//�������ļ�
	public void func() throws IOException{
		//�����ļ�
		File newFile = new File("D:\\1803File\\file1803.txt");
		newFile.createNewFile();
	}
	//ɾ��ָ���ļ�
	public void delFunc(){
		File delFile = new File("D:\\1803File\\file1803.txt");
		delFile.delete();
	}
}
