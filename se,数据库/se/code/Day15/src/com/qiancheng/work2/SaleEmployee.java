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

	//���۹��ʽ���
	public void saySaley() {
		System.out.println("���ۣ���������" + super.getSalary() + " ����" + percentage + " һ����" + getEmpSalary());
	}
}
