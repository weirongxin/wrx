package com.qiancheng.work1;

import java.util.ArrayList;
import java.util.List;

public class Work3 {

	public static void main(String[] args) {
		Library l = new Library();
		//创建学生集合  写数据
		List<Student> stus = new ArrayList<Student>();
		stus.add(new Student("xiaoming", 19, "F"));
		stus.add(new Student("dabai",20,"M"));
		stus.add(new Student("BuLow",18,"F"));
		
		String stuStr = l.addStu(stus);
		l.writeFile(stuStr);
		
		//从文件中读取数据
		List<Student> stus2 =  l.readInfo();
		System.out.println(stus2);
	}

}
