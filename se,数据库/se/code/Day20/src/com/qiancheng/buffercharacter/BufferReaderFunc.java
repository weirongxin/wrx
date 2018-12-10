package com.qiancheng.buffercharacter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferReaderFunc {

	public static void main(String[] args) {
		//�ַ� ��Ч��
		//1.�����ļ�·������ �ļ�����
		File oldFile = new File("file\\se.txt");
		//���ļ�
		File newFile = new File("file\\newSE.txt");
		
		//2.����������
		BufferedReader r = null;
		BufferedWriter w = null;
		
		try {
			//�����ֽ��� ʵ�� ת����   ������ת���� ʵ���ַ���
			r = new BufferedReader(new InputStreamReader(new FileInputStream(oldFile)));
			w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newFile)));
			//���� ��ȡ�ַ���
			String getData = null;
			while((getData = r.readLine())!=null){
				 w.write(getData);
				 w.write("\n");
				 w.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
