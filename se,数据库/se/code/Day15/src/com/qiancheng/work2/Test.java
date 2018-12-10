package com.qiancheng.work2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonEmployee e1 = new CommonEmployee();
		e1.setSalary(1000);
		e1.setSubsidy(500);
		
		Manager e2 = new Manager();
		e2.setBonus(10000);
		e2.setSalary(5000);
		
		SaleEmployee e3 = new SaleEmployee();
		e3.setSalary(800);
		e3.setPercentage(20000);
		
		Employee[] emps = {e1,e2,e3};
		
		for(Employee e:emps){
			e.saySaley();
		}
	}

}
