package com.homework3;

public class Creature2 {
	private Cat cat;
	private Dog dog;
	private String sound;
	public Creature2() {
		super();
	}
	public Creature2(Cat cat, Dog dog) {
		super();
		this.cat = cat;
		this.dog = dog;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	//传递一猫   将属性cat赋值  将声音赋值
	public void setNarl(Cat cc){
		this.cat = cc;
		this.sound = cc.getSound();
	}
	//传递一只狗  将属性dog赋值 将声音赋值
	public void setNarl(Dog dd){
		this.dog = dd;
		this.sound = dd.getSound();
	}
	public String output(){
		return this.sound;
	}
}
