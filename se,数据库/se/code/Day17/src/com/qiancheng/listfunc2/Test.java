package com.qiancheng.listfunc2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Collection students = new ArrayList();
		for(int i=0;i<5;i++){
			Student stu = new Student();
			stu.setId(i);
			students.add(stu);
		}
		
		Iterator iterator = students.iterator();
		while(iterator.hasNext()){
			//迭代到集合中的元素
			Object obj = iterator.next();
			//打印输出集合对象  则默认调用toString方法
			System.out.println(obj);
			//判断是否为学生类类型
			if(obj instanceof Student){
				//将引用类型向下转型。调用实现类对象中的方法
				Student stu = (Student)obj;
				stu.say();
			}
		}

	}

}
