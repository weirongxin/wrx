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
	//��ͨԱ�����ʽ���
	public void saySaley(){
		System.out.println("��ͨԱ������������"+super.getSalary()+" ����"
					+subsidy+" һ����"+getEmpSalary());
	}
}
