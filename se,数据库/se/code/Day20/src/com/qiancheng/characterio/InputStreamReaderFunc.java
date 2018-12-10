package com.qiancheng.characterio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderFunc {

	public static void main(String[] args) {
		//1.����·�������ļ�����
		File f = new File("file\\��.txt");
		//2.�����ַ�����ת��������
		InputStreamReader r = null;
		try {
			//3.�����ֽ��� ʵ�����ַ�ת����
			r = new InputStreamReader(new FileInputStream(f));
			//4.����char[]  ���ڴ��ļ��л�ȡ����
			char[] data = new char[1024];
			//5.ѭ����ȡ�ļ��е����ݵ�������   ֱ�����һ��Ԫ�ط���ֵΪ-1ʱֹͣ��ȡ
			while(r.read(data)!=-1){ 
				//6.��ȡ�����ַ����� ת��Ϊ�ַ������
				String s = String.valueOf(data);
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(r!=null){
					r.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			

	}

}
