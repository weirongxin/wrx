package com.qiancheng.characterio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterFunc {

	public static void main(String[] args) {
		//字符节点转换流 输出流
		//1.根据路径创建文件对象
		File f = new File("file\\鹅.txt");
		//2.声明流对象
		OutputStreamWriter out = null;
		try {
			out = new OutputStreamWriter(new FileOutputStream(f,true));
			out.write("窗前明月光。。。。。");
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
