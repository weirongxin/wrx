package com.qiancheng.work3;

public class HourlyEmployee extends ColaEmployee {
	private double hourSalary;
	private int hourCount;
	
	public HourlyEmployee() {
		super();
	}
	public HourlyEmployee(String name, int birthMonth,double hourSalary,int hourCount) {
		super(name, birthMonth,0.0);
		this.hourSalary = hourSalary;
		this.hourCount = hourCount;
	}
	public double getHourSalary() {
		return hourSalary;
	}
	public void setHourSalary(double hourSalary) {
		this.hourSalary = hourSalary;
	}
	public int getHourCount() {
		return hourCount;
	}
	public void setHourCount(int hourCount) {
		this.hourCount = hourCount;
	}
	
	
}
