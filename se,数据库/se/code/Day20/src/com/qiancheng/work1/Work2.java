package com.qiancheng.work1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Work2 {

	public static void main(String[] args) {
		//1.���������� ��Ҫ���Ƶ��ļ�·��
		String filePath = "D:\\Java1803\\SE\\day19-�ļ���IO\\����-�ļ���IO\\��Т��С���.jpg";
		//�������ļ���·��
		String newFilePath = "file\\newPic.jpg";
		//2.����·�������ļ�����
		File oldFile = new File(filePath);
		File newFile = new File(newFilePath);
		//3.�ж����ļ��Ƿ���� ����������򴴽�
		if(newFile.exists()){
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//4.����������
		InputStream in = null;
		OutputStream out = null;
		
		long startTime = System.currentTimeMillis();
		//5.�����ļ����󴴽�����
		try {
			in = new FileInputStream(oldFile);
			out = new FileOutputStream(newFile);
			int getData = -1;
			while((getData = in.read())!=-1){
				out.write(getData);
			}
			long endTime = System.currentTimeMillis();
			
			System.out.println("�ֽڡ��ڵ����ļ����Ƶ�ʱ�䣺"+(endTime-startTime));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			//6.��Դ�ͷ�
			try {
				if(in!=null){
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
