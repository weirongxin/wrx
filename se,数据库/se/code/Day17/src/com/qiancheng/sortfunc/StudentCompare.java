package com.qiancheng.sortfunc;

import java.util.Comparator;
//自定义学生比较条件类
public class StudentCompare implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student && o2 instanceof Student){
			Student stu1 = (Student)o1;
			Student stu2 = (Student)o2;
			return stu1.getAge()-stu2.getAge();
		}
		
		return 0;
	}

}
