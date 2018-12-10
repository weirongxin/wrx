package com.qiancheng.io1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamFunc {

	//��ȡ����Ŀ¼��file�ļ�����file1.txt�ļ��е�����
	public static void main(String[] args) {
		//1.����·�������ļ�����
		File file = new File("file\\file1.txt");
		//2.����������
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			//���� ��ȡ�����ֽ�����
			int readData = -1;
			//�����ж�ȡ�ֽ����ݣ�ÿ�ζ�ȡһ���ֽڣ�������-1ʱ��Ϊ�ļ�ĩβ ֹͣ
			while((readData = inputStream.read())!=-1){
				char c = (char)readData;
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			//finally�д���Ϊ��Դ���ͷ�
			try {
				//�ͷ���Դǰ�����ݴ���
				if(inputStream!=null){
					inputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
