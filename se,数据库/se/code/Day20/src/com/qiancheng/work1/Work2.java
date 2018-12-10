package com.qiancheng.work1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Work2 {

	public static void main(String[] args) {
		//1.定义变量存放 需要复制的文件路径
		String filePath = "D:\\Java1803\\SE\\day19-文件与IO\\板书-文件与IO\\韩孝周小姐姐.jpg";
		//定义新文件的路径
		String newFilePath = "file\\newPic.jpg";
		//2.根据路径创建文件对象
		File oldFile = new File(filePath);
		File newFile = new File(newFilePath);
		//3.判断新文件是否存在 如果不存在则创建
		if(newFile.exists()){
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//4.声明流对象
		InputStream in = null;
		OutputStream out = null;
		
		long startTime = System.currentTimeMillis();
		//5.根据文件对象创建对象
		try {
			in = new FileInputStream(oldFile);
			out = new FileOutputStream(newFile);
			int getData = -1;
			while((getData = in.read())!=-1){
				out.write(getData);
			}
			long endTime = System.currentTimeMillis();
			
			System.out.println("字节、节点流文件复制的时间："+(endTime-startTime));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			//6.资源释放
			try {
				if(in!=null){
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
