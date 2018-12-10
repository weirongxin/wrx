package com.qiancheng.work3;

public class Company {
	
	public double getEmployeeMoney(int month,ColaEmployee employee){
		double money = 0.0;
		if(employee instanceof SalariedEmployee){
			money = employee.getSalary(month);
		}else if(employee instanceof HourlyEmployee){
			money = employee.getSalary(month);
			int hour = ((HourlyEmployee) employee).getHourCount();
			double hourSal = ((HourlyEmployee) employee).getHourSalary();
			if(hour>160){
				money += (hour-160)*hourSal*1.5;
				hour-= (hour-160);
			}
			money+= hour*hourSal;
		}else if(employee instanceof SalesEmployee){
			money = employee.getSalary(month);
			double sal = ((SalesEmployee) employee).getMonthSales();
			double per = ((SalesEmployee) employee).getPercent();
			money += sal*per;
		}
		return money;
	}
}