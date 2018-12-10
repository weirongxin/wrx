package com.qiancheng.oop1;

public class Test {

	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog= new Dog();
		
//		an.say();
//		cat.say();
//		dog.say();
		Test t = new Test();
		//普通的方法传入 引用类型参数、进行对象调用成员方法
		t.method(an);
		//方法传参时，需要父类类型，传入的为子类对象
		t.method(cat);
	}
	
	public void method(Animal animal){
		animal.say();
	}
	

}
