package com.homework3;

public class Sound2 {

	public static void main(String[] args) {
		Creature2 cc = new Creature2();
		cc.setNarl(new Cat("miao..."));
		cc.setNarl(new Dog("wang...."));
		System.out.println(cc.output());

	}

}
