package com.qiancheng.io1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamFunc {

	//获取工程目录下file文件夹中file1.txt文件中的内容
	public static void main(String[] args) {
		//1.根据路径创建文件对象
		File file = new File("file\\file1.txt");
		//2.创建流对象
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			//定义 读取到的字节数据
			int readData = -1;
			//从流中读取字节数据，每次读取一个字节，当读到-1时即为文件末尾 停止
			while((readData = inputStream.read())!=-1){
				char c = (char)readData;
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			//finally中代码为资源的释放
			try {
				//释放资源前先做容错处理
				if(inputStream!=null){
					inputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
