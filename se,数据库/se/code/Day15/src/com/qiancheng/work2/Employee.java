package com.qiancheng.work2;

public abstract class Employee {
	private double salary;
	private String name;
	
	//计算员工薪水的抽象方法
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
