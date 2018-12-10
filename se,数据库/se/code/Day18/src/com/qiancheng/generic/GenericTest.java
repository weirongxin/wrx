package com.qiancheng.generic;

import java.util.ArrayList;
import java.util.Collection;

public class GenericTest {

	public static void main(String[] args) {
		//1.通过类 指定该类需要使用的泛型  
		Dog<Integer> dog = new Dog<Integer>();
		//类中的属性通过   泛型确定了成员的数据类型
		dog.name = 1;
		dog.print();
		
		Dog<String> dog2 = new Dog<String>();
		dog2.name = "helloWorld";
		dog2.print();
		
		//2.方法通过泛型指定方法中参数的类型
		Dog dog3 = new Dog();
		dog3.func("123");
		dog3.func(1);	
		
		//3.参数传递时  集合中的数据类型通过泛型指定
		//泛型指定响应数据类型，则元素即为该数据类型
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		Dog.func2(dogs);
		
		//4.如果需要传递 元素为Dog  而参数中元素为非指定类型时，不能正常传参
//		ArrayList<Object> dogs2 = new ArrayList<Object>();
//		Dog.func2(dogs2);
		
		//5.泛型的通配符  ?  super:限定能取当前指定类及其父类
		//               extends:限定能取当前类及其子类
		ArrayList<? super LittleDog> list = new ArrayList<Dog>();
		System.out.println(list);
		
//		ArrayList<? extends LittleDog> list2 = new ArrayList<Dog>();
//		System.out.println(list2);
	}
}
//在类名 后使用泛型 说明类中存在泛指的数据类型T
class  Dog <T>{
	T name;
	public void print(){
		System.out.println(name);
	}
	//方法需要泛型时   在方法声明处 定义泛型，参数使用该泛型
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
