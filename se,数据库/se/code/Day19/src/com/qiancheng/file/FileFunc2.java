package com.qiancheng.file;

import java.io.File;
import java.io.IOException;

public class FileFunc2 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\1803File\\file2.txt");
		//修改文件名字  如果路径相同 则为修改文件的名字，路径不同为修改后剪切、粘贴
		boolean status =  file.renameTo(new File("D:\\file2.txt"));
		System.out.println(status);
		
		FileFunc2 t = new FileFunc2();
		t.delFunc();
	}
	//创建新文件
	public void func() throws IOException{
		//创建文件
		File newFile = new File("D:\\1803File\\file1803.txt");
		newFile.createNewFile();
	}
	//删除指定文件
	public void delFunc(){
		File delFile = new File("D:\\1803File\\file1803.txt");
		delFile.delete();
	}
}
