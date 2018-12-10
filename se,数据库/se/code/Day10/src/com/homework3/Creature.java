package com.homework3;

public class Creature {
	private String sound;

	public Creature() {
		super();
	}

	public Creature(String sound) {
		super();
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public void setNarl(Cat c){
		this.sound = c.getSound();
	}
	public void setNarl(Dog d){
		this.sound = d.getSound();
	}
	public String output(){
		return this.sound;
	}
}
