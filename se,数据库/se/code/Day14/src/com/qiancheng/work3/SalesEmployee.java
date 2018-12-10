package com.qiancheng.work3;

public class SalesEmployee extends ColaEmployee {
	private double monthSales;
	private double percent;
	public SalesEmployee() {
		super();
	}
	public SalesEmployee(String name,int birthmonth, double monthSales, double percent) {
		super(name,birthmonth,0.0);
		this.monthSales = monthSales;
		this.percent = percent;
	}
	public double getMonthSales() {
		return monthSales;
	}
	public void setMonthSales(double monthSales) {
		this.monthSales = monthSales;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	
}
