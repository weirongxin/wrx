package com.qiancheng.setfun1;

public class Pig {
	private String name;
	private double weight;
	public Pig() {
		super();
	}
	public Pig(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Pig [name=" + name + ", weight=" + weight + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("------");
		return name.hashCode(); //super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pig){
			Pig p = (Pig)obj;
			if(this.name.equals(p.name) && this.weight==p.weight){
				return true;
			}
		}
		return super.equals(obj);
	}
	
}
