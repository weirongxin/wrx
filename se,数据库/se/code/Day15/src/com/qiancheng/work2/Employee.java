package com.qiancheng.work2;

public abstract class Employee {
	private double salary;
	private String name;
	
	//����Ա��нˮ�ĳ��󷽷�
	public abstract double getEmpSalary();
	public abstract void saySaley();
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
