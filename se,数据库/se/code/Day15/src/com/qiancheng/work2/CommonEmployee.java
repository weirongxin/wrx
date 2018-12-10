package com.qiancheng.work2;

public class CommonEmployee extends Employee {
	private double subsidy;
	
	public double getSubsidy() {
		return subsidy;
	}
	public void setSubsidy(double subsidy) {
		this.subsidy = subsidy;
	}

	@Override
	public double getEmpSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+subsidy;
	}
	//普通员工工资介绍
	public void saySaley(){
		System.out.println("普通员工：基本工资"+super.getSalary()+" 补贴"
					+subsidy+" 一共："+getEmpSalary());
	}
}
