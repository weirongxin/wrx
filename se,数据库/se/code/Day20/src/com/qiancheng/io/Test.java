package com.qiancheng.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) {
		//1.���������� ��Ҫ���Ƶ��ļ�·��
		String filePath = "D:\\Java1803\\SE\\day19-�ļ���IO\\����-�ļ���IO\\��Т��С���.jpg";
		//�������ļ���·��
		String newFilePath = "file\\newPic.jpg";
		//2.����·�������ļ�����
		File oldFile = new File(filePath);
		File newFile = new File(newFilePath);

		InputStream in = null;
		OutputStream out = null;
		long startTime = System.currentTimeMillis();

		try {
			in = new BufferedInputStream(new FileInputStream(oldFile));
			out = new BufferedOutputStream(new FileOutputStream(newFile));

			int readData = -1;
			while((readData = in.read())!=-1){
				out.write(readData);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("�ֽڡ��������ļ����Ƶ�ʱ�䣺"+(endTime-startTime));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(in !=null){
					in.close();
				}
				if(out!=null){
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
	}

}
