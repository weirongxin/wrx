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


	//�ȽϽӿ� �еķ���ʵ��
	//��ѧ�������� �Ƚ�ѧ������Ĵ�С

	//��� ��ǰ���� С�ڲ������� ����ֵΪ<0  
	//   ���ڲ�������  ����ֵΪ>0
	//   ���ڲ������� ����ֵΪ0
	/*
	@Override
	public int compareTo(Object o) {
		if(o instanceof Student){
			Student stu = (Student)o;
			//this>���� �򷵻�ֵ>0
			//this<���� ����ֵ<0
			//this==���� ����ֵ=0
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
