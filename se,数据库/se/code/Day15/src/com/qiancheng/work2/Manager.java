package com.qiancheng.work2;

public class Manager extends Employee {
	//����
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

	//�����ʽ���
	public void saySaley() {
		System.out.println("������������" + super.getSalary() + " ����" + bonus + " һ����" + getEmpSalary());
	}
}
