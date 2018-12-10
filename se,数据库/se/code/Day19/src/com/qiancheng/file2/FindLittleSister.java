package com.qiancheng.file2;

import java.io.File;
import java.io.FileFilter;

public class FindLittleSister {

	public static void main(String[] args) {
		File[] getfiles = FindLittleSister.findSister("D:\\Java1803\\svn\\–°Ω„Ω„’’∆¨");
		for(File ff:getfiles){
			System.out.println(ff.getName());
		}
	}
	
	public static File[] findSister(String pathName){
		File[] files = null;
		File f = new File(pathName);
		files = f.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				String fileName = pathname.getName();
				if(fileName.endsWith("jpg")||fileName.endsWith("jpeg")){
					if(fileName.contains("–°Ω„Ω„")){
						return true;
					}
				}
				return false;
			}
		});
		return files;
	}

}
