package com.qiancheng.work3;

public class ColaEmployee {
	private String name;
	private int birthMonth;
	private double salary;
	
	public ColaEmployee() {
		super();
	}

	public ColaEmployee(String name, int birthMonth, double salary) {
		super();
		this.name = name;
		this.birthMonth = birthMonth;
		this.salary = salary;
	}

	//如果生日 则多发一百
	public double getSalary(int month){
		if(month==birthMonth){
			salary+=100;
		}
		return salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
