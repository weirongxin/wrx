package com.qiancheng.generic;

import java.util.ArrayList;
import java.util.Collection;

public class GenericTest {

	public static void main(String[] args) {
		//1.ͨ���� ָ��������Ҫʹ�õķ���  
		Dog<Integer> dog = new Dog<Integer>();
		//���е�����ͨ��   ����ȷ���˳�Ա����������
		dog.name = 1;
		dog.print();
		
		Dog<String> dog2 = new Dog<String>();
		dog2.name = "helloWorld";
		dog2.print();
		
		//2.����ͨ������ָ�������в���������
		Dog dog3 = new Dog();
		dog3.func("123");
		dog3.func(1);	
		
		//3.��������ʱ  �����е���������ͨ������ָ��
		//����ָ����Ӧ�������ͣ���Ԫ�ؼ�Ϊ����������
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		Dog.func2(dogs);
		
		//4.�����Ҫ���� Ԫ��ΪDog  ��������Ԫ��Ϊ��ָ������ʱ��������������
//		ArrayList<Object> dogs2 = new ArrayList<Object>();
//		Dog.func2(dogs2);
		
		//5.���͵�ͨ���  ?  super:�޶���ȡ��ǰָ���༰�丸��
		//               extends:�޶���ȡ��ǰ�༰������
		ArrayList<? super LittleDog> list = new ArrayList<Dog>();
		System.out.println(list);
		
//		ArrayList<? extends LittleDog> list2 = new ArrayList<Dog>();
//		System.out.println(list2);
	}
}
//������ ��ʹ�÷��� ˵�����д��ڷ�ָ����������T
class  Dog <T>{
	T name;
	public void print(){
		System.out.println(name);
	}
	//������Ҫ����ʱ   �ڷ��������� ���巺�ͣ�����ʹ�ø÷���
	public <E> void func(E e){
		System.out.println(e);
	}
	public static void func2(Collection<Dog> c){
		System.out.println(c);
	}
}

class LittleDog extends Dog{
	
}
class Dog2 extends LittleDog{
	
}
