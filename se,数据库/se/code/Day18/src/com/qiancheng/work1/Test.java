package com.qiancheng.work1;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		//实例化5个学生对象，比较条件：先以成绩排序、再身高排序、以体重排序、以名字排序
		Student stu1 = new Student("xiaoming", 250.0F, 200.0F, 99);
		Student stu2 = new Student("xiaohong", 120.0F, 70.0F, 90);
		Student stu3 = new Student("xiaowang", 120.0F, 70.0F, 90);
		Student stu4 = new Student("xiaoqi", 250.0F, 80.0F, 80);
		Student stu5 = new Student("xiaozhang", 250.0F, 50.0F, 70);

		ArrayList stus = new ArrayList();
		stus.add(stu1);
		stus.add(stu2);
		stus.add(stu3);
		stus.add(stu4);
		stus.add(stu5);
		
		Collections.sort(stus);
		
		for(Object obj:stus){
			System.out.println(obj);
		}
	}

}
