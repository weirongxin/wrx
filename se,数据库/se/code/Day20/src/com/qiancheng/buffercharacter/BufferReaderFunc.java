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
		//字符 高效率
		//1.根据文件路径创建 文件对象
		File oldFile = new File("file\\se.txt");
		//新文件
		File newFile = new File("file\\newSE.txt");
		
		//2.声明流对象
		BufferedReader r = null;
		BufferedWriter w = null;
		
		try {
			//根据字节流 实例 转换流   、根据转换流 实例字符流
			r = new BufferedReader(new InputStreamReader(new FileInputStream(oldFile)));
			w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newFile)));
			//声明 读取字符串
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
