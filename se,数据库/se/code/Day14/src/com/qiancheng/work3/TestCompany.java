package com.qiancheng.work3;

public class TestCompany {

	public static void main(String[] args) {
		//�̶����ʵ�Ա��
		SalariedEmployee salEmployee 
			= new SalariedEmployee("С��", 6, 200);
		//Сʱ��
		HourlyEmployee hourEmp 
			= new HourlyEmployee("С��", 6, 2, 170);
		//������Ա
		SalesEmployee salEmp
			= new SalesEmployee("С��", 5, 10000, 0.07);
		ColaEmployee[] emps = {salEmployee,hourEmp,salEmp};
		
		//ʵ������ǰ�����
		TestCompany test = new TestCompany();
		//���������е�ÿ��Ա��  
		//���÷���  ��ÿ��Ա�����ݸ�Company��˾���㹤��
		for(ColaEmployee emp:emps){
			test.getSalary(emp);
		}
	}
	//�ù�˾�����  Ա���Ĺ���
	public void getSalary(ColaEmployee emp){
		Company company = new Company();
		double salary = company.getEmployeeMoney(5, emp);
		System.out.println("����:"+salary);
	}

}
