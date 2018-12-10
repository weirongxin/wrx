package com.qiancheng.sortfunc;

public class Student {//implements Comparable{
	private int age;
	
	public Student(int age) {
		super();
		this.age = age;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	//比较接口 中的方法实现
	//以学生的年龄 比较学生对象的大小

	//如果 当前对象 小于参数对象 返回值为<0  
	//   大于参数对象  返回值为>0
	//   等于参数对象 返回值为0
	/*
	@Override
	public int compareTo(Object o) {
		if(o instanceof Student){
			Student stu = (Student)o;
			//this>参数 则返回值>0
			//this<参数 返回值<0
			//this==参数 返回值=0
//			if(this.age>stu.getAge()){
//				return 1;
//			}else if(this.age==stu.getAge()){
//				return 0;
//			}else{
//				return -1;
//			}
			return this.age-stu.age;
		}
		return 0;
	}
*/

	@Override
	public String toString() {
		return "Student [age=" + age + "]";
	}

	
}
