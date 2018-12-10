package com.qiancheng.file;

import java.io.File;
import java.io.FileFilter;

public class FileFunc3 {

	public static void main(String[] args) {
		File[] txtFile =  FileFunc3.getTxtFile(new File("D:\\1803File"));
		for(File ff : txtFile){
			System.out.println(ff);
		}
	}
	//将参数文件    先获取所有的子文件，再筛选是txt的文件
	//File[] listFiles(FileFilter filter) 
	public static File[] getTxtFile(File file){
		File[] files = null;
		files = file.listFiles(new FileFilter(){

			//文件过滤器 接口中的方法
			//文件获取的过程中，每个文件都传入accpet方法判断是否符合，符合存入结果数组中
			@Override
			public boolean accept(File pathname) {
				if(pathname.getName().endsWith("txt")){
					return true;
				}
				return false;
			}
			
		});
		
		return files;	
	}
}
