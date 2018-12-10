package com.qiancheng.work2;

public class Tiger {
	private float weight;
	private String name;
	private int speed;
	public Tiger() {
		super();
	}
	public Tiger(float weight, String name, int speed) {
		super();
		this.weight = weight;
		this.name = name;
		this.speed = speed;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Tiger [weight=" + weight + ", name=" + name + ", speed=" + speed + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pig){
			Pig p = (Pig)obj;
			if(this.getWeight()==p.getWeight()){
				if(this.getSpeed()==p.getSpeed()){
					if(this.getName().equals(p.getName())){
						return true;
					}
				}
			}
		}else if(obj instanceof Tiger){
			Tiger t = (Tiger)obj;
			if(this.getWeight()==t.getWeight()){
				if(this.getName().equals(t.getName())){
					if(this.getSpeed()==t.getSpeed()){
						return true;
					}
				}
			}
		}
		return super.equals(obj);
	}
	
}
