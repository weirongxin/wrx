package com.homework3;

public class Vehicle {
	private String brand="����";
	private String color="��ɫ";
	private double speed=0;
	
	public Vehicle() {
		super();
	}
	public Vehicle(String brand) {
		super();
		this.brand = brand;
	}
	public Vehicle(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	//���� ���ܹ���
	public void run(){
		System.out.println(brand+"  "+color+"  "+speed);

	}
}
