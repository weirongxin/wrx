package com.qiancheng.io1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamFunc2 {

	public static void main(String[] args) {
		//1.�����ļ�
		File f = new File("file\\file2.txt");
		//�ļ��Ƿ���ڣ������������ �������ļ�
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//2.����������
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(f);
			String str = "helloworld";
			char[] data = str.toCharArray();
			for(char c:data){
				outputStream.write(c);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(outputStream!=null){
					outputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
