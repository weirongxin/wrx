package com.qiancheng.work3;

public class SalariedEmployee extends ColaEmployee {
	private double monthSalary;
	
	public SalariedEmployee(String name,int birMonth,double monthSalary) {
		super(name,birMonth,monthSalary);
		this.monthSalary = monthSalary;
	}

	public double getMonthSalary() {
		return monthSalary;
	}

	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}
	
}
