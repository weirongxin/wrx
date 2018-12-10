package com.qiancheng.work1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Library {
	public static final String FILENAME = "file\\studentInfo.txt";
	public String addStu(List<Student> stus){
		StringBuffer stuStr = new StringBuffer();
		for(Student stu: stus){
			stuStr.append(stu.toString());
			stuStr.append("=");
		}
		return stuStr.toString();
	}
	
	public void writeFile(String data){
		
		File stuFile = new File(FILENAME);
		if(!stuFile.exists()){
			try {
				stuFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		OutputStream out = null;
		try {
			out = new FileOutputStream(stuFile);
			char[] datas = data.toCharArray();
			for(char c:datas){
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(out!=null){
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public List<Student> readInfo(){
		List<Student> stus = new ArrayList<Student>();
		File file = new File(FILENAME);
		InputStream in = null;
		try {
			in = new FileInputStream(file);
			int getData = -1;
			StringBuffer getStudentStr = new StringBuffer();
			
			while((getData = in.read())!=-1){
				char c = (char)getData;
				String s = String.valueOf(c);
				getStudentStr.append(s);
			}
			
			//将字符串数据拆分为学生集合对象
			System.out.println(getStudentStr);
			String[] stuArray = getStudentStr.toString().split("="); 
			for(int i=0;i<stuArray.length;i++){
				String stuStr =stuArray[i];
				String[] stuData = stuStr.split(",");
				String age =  stuData[1];
				Integer ageInt = Integer.valueOf(age);
				Student stu = new Student(stuData[0], ageInt, stuData[2]);
				stus.add(stu);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(in!=null){
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return stus;
	}
}
