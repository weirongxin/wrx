package com.homework3;

public class Car extends Vehicle{
	private int loader;

	public Car() {
		super();
	}

	public Car(int loader) {
		super();
		this.loader = loader;
	}
	
	public int getLoader() {
		return loader;
	}

	public void setLoader(int loader) {
		this.loader = loader;
	}

	public void run(){
		System.out.println(getBrand()+"  "+getColor()+"  "
				+getSpeed()+" "+getLoader());
	}
}
