package com.qiancheng.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) {
		//1.定义变量存放 需要复制的文件路径
		String filePath = "D:\\Java1803\\SE\\day19-文件与IO\\板书-文件与IO\\韩孝周小姐姐.jpg";
		//定义新文件的路径
		String newFilePath = "file\\newPic.jpg";
		//2.根据路径创建文件对象
		File oldFile = new File(filePath);
		File newFile = new File(newFilePath);

		InputStream in = null;
		OutputStream out = null;
		long startTime = System.currentTimeMillis();

		try {
			in = new BufferedInputStream(new FileInputStream(oldFile));
			out = new BufferedOutputStream(new FileOutputStream(newFile));

			int readData = -1;
			while((readData = in.read())!=-1){
				out.write(readData);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("字节、缓冲流文件复制的时间："+(endTime-startTime));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(in !=null){
					in.close();
				}
				if(out!=null){
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
	}

}
