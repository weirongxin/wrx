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
		//��ͨ�ķ������� �������Ͳ��������ж�����ó�Ա����
		t.method(an);
		//��������ʱ����Ҫ�������ͣ������Ϊ�������
		t.method(cat);
	}
	
	public void method(Animal animal){
		animal.say();
	}
	

}
