package com.qiancheng.characterio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterFunc {

	public static void main(String[] args) {
		//�ַ��ڵ�ת���� �����
		//1.����·�������ļ�����
		File f = new File("file\\��.txt");
		//2.����������
		OutputStreamWriter out = null;
		try {
			out = new OutputStreamWriter(new FileOutputStream(f,true));
			out.write("��ǰ���¹⡣��������");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(out!=null){
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
