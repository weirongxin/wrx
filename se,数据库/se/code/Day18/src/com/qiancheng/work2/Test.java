package com.qiancheng.work2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("xiaoming", 9000.0, 20, new Book("java", 200.0));
		Person p2 = new Person("xiaoming", 8000.0, 20, new Book("java", 200.0));
		Person p3 = new Person("xiaoming", 8000.0, 25, new Book("java", 200.0));
		Person p4 = new Person("xiaoming", 8000.0, 25, new Book("java", 100.0));
		Person p5 = new Person("xiaoming", 8000.0, 22, new Book("java", 200.0));
		Person p6 = new Person("xiaoming", 2000.0, 20, new Book("java", 200.0));
		
		ArrayList persons = new ArrayList();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		persons.add(p6);
		//1.元素中的类实现Comparable接口
		Collections.sort(persons);
		//2.自定义类 实现Comparator接口
		Collections.sort(persons, new CustomComparator());
		//3.匿名内部类 实现Comparator接口
		Collections.sort(persons,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Person&&o2 instanceof Person){
					Person p1 = (Person)o1;
					Person p = (Person)o2;
					if(p1.getSalary()==p.getSalary()){
						if(p1.getAge()==p.getAge()){
							if(p1.getName().equals(p.getName())){
								if(p1.getBook().getPrice()==p.getBook().getPrice()){
									return p1.getBook().getName().compareTo(p.getBook().getName());
								}
								return (int)(p1.getBook().getPrice()-p.getBook().getPrice());
							}
							return p1.getName().compareTo(p.getName());
						}
						return p1.getAge()-p.getAge();
					}
					return (int)(p1.getSalary()-p.getSalary());
				}
				return 0;
			}
			
		});
		
		Iterator iterator = persons.iterator();
		while(iterator.hasNext()){
			Object obj = iterator.next();
			System.out.println(obj);
		}
		
	}

}
