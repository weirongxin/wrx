package com.qiancheng.work2;

public class Manager extends Employee {
	//奖金
	private double bonus;
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double getEmpSalary() {
		return super.getSalary()+bonus;
	}

	//经理工资介绍
	public void saySaley() {
		System.out.println("经理：基本工资" + super.getSalary() + " 奖金" + bonus + " 一共：" + getEmpSalary());
	}
}
