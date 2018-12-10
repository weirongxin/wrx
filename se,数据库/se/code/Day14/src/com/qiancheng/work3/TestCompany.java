package com.qiancheng.work3;

public class TestCompany {

	public static void main(String[] args) {
		//固定工资的员工
		SalariedEmployee salEmployee 
			= new SalariedEmployee("小明", 6, 200);
		//小时工
		HourlyEmployee hourEmp 
			= new HourlyEmployee("小红", 6, 2, 170);
		//销售人员
		SalesEmployee salEmp
			= new SalesEmployee("小花", 5, 10000, 0.07);
		ColaEmployee[] emps = {salEmployee,hourEmp,salEmp};
		
		//实例化当前类对象
		TestCompany test = new TestCompany();
		//遍历数组中的每个员工  
		//调用方法  将每个员工传递给Company公司计算工资
		for(ColaEmployee emp:emps){
			test.getSalary(emp);
		}
	}
	//让公司类计算  员工的工资
	public void getSalary(ColaEmployee emp){
		Company company = new Company();
		double salary = company.getEmployeeMoney(5, emp);
		System.out.println("工资:"+salary);
	}

}
