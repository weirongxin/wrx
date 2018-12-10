package com.qiancheng.work1;

import java.io.File;
import java.io.FileFilter;

/*
将新白娘子专辑中的 文件名 批量修改：
  例如：
  新白娘子传奇1_呼哈呼哈呼哈_001.txt-->新白娘子传奇1_001.txt
  新白娘子传奇1_呼哈呼哈呼哈_002.txt-->新白娘子传奇1_002.txt
 */
public class Work1 {

	public static void main(String[] args) {
		File file = new File("D:\\Java1803\\SE\\day19-文件与IO\\作业\\新白娘子专辑");
		File[] files = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				//取文件的父路径
				String parentPath = pathname.getParent();
				//取文件名
				String fileName = pathname.getName();
				//根据下划线 拆分文件名
				String[] fileStr =  fileName.split("_");
				//创建字符串缓冲、拼接新文件名字
				if(fileStr!=null && fileStr.length>=3){
					StringBuffer newName = new StringBuffer();
					newName.append(fileStr[0]);
					newName.append("_");
					newName.append(fileStr[2]);
					//修改文件名
					pathname.renameTo(new File(parentPath+"\\"+newName.toString()));
				}
				
				return true;
			}
		});
		for(File f:files){
			System.out.println(f.getName());
		}
	}

}
