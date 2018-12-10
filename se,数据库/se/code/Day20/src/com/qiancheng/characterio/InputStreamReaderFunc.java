package com.qiancheng.characterio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderFunc {

	public static void main(String[] args) {
		//1.根据路径创建文件对象
		File f = new File("file\\鹅.txt");
		//2.声明字符输入转换流对象
		InputStreamReader r = null;
		try {
			//3.根据字节流 实例化字符转换流
			r = new InputStreamReader(new FileInputStream(f));
			//4.定义char[]  用于从文件中获取数据
			char[] data = new char[1024];
			//5.循环读取文件中的数据到数组中   直到最后一个元素返回值为-1时停止读取
			while(r.read(data)!=-1){ 
				//6.读取到的字符数组 转换为字符串输出
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
