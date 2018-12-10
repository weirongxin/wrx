package com.qiancheng.oop3;
public class Student {
	private String sound = "ÓÑÒêµÚÒ»";

	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public void speak(){
		System.out.println(sound);
	}
}
