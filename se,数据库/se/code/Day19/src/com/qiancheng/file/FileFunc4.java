package com.qiancheng.file;

import java.io.File;
/*
 * 练习1.在本机的磁盘系统中，找一个文件夹，利用File类的提供方法，列出该文件夹中的所有文件

的文件名和文件的路径，执行效果如下：
路径是xxx的文件夹内的文件有：
文件名：abc.txt
路径名：c:\temp\abc.txt 
--------------------------------------------
文件名：def.txt
路径名：c:\temp\def.txt 
 */
public class FileFunc4 {

	public static void main(String[] args) {
		File file = new File("D:\\");
		File[] files =  file.listFiles();
		for(File f:files){
			System.out.println("文件名："+f.getName());
			System.out.println("  文件路径："+f.getAbsolutePath());
		}
	}

}
