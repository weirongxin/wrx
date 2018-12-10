package com.qiancheng.work2;

public class SaleEmployee extends Employee {
	private double percentage;
	
	
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


	@Override
	public double getEmpSalary() {
		return super.getSalary()+percentage;
	}

	//销售工资介绍
	public void saySaley() {
		System.out.println("销售：基本工资" + super.getSalary() + " 奖金" + percentage + " 一共：" + getEmpSalary());
	}
}
