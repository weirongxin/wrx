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
	
	//����һè   ������cat��ֵ  ��������ֵ
	public void setNarl(Cat cc){
		this.cat = cc;
		this.sound = cc.getSound();
	}
	//����һֻ��  ������dog��ֵ ��������ֵ
	public void setNarl(Dog dd){
		this.dog = dd;
		this.sound = dd.getSound();
	}
	public String output(){
		return this.sound;
	}
}
