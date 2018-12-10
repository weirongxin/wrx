package com.qiancheng.file;

import java.io.File;

public class FileFunc1 {

	public static void main(String[] args) {
		//1.定义字符串类型文件路径
//		String filePath = "D:\\1803File\\file1.txt";
//		String filePath = "file\\file1.txt";
		String filePath = "D:\\1803File";

		//2.根据字符串路径 创建文件对象
		File file = new File(filePath);
		System.out.println(file);
		//3.获取文件对象中包含的文件属性
		System.out.println("文件是否可执行"+file.canExecute());
		System.out.println("文件是否可读"+file.canRead());
		System.out.println("文件是否是隐藏的"+file.isHidden());
		//相对路径 指相对当前工程所在的位置
		//绝对路径 指文件所在磁盘目录位置
		System.out.println("文件的绝对路径"+file.getAbsolutePath());
		
		//4.获取当前位置所有的子文件
		String[] files =  file.list();
		for(String str:files){
			System.out.println(str);
		}
	}

}
