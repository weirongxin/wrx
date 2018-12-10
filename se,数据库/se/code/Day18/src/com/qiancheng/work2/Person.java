package com.qiancheng.work2;

public class Person {//implements Comparable{
	private String name;
	private double salary;
	private int age;
	private Book book;
	public Person() {
		super();
	}
	public Person(String name, double salary, int age, Book book) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.book = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + ", age=" + age + ", book=" + book + "]";
	}
//	@Override
//	public int compareTo(Object o) {
//		if(o instanceof Person){
//			Person p = (Person)o;
//			if(this.getSalary()==p.getSalary()){
//				if(this.getAge()==p.getAge()){
//					if(this.getName().equals(p.getName())){
//						if(this.getBook().getPrice()==p.getBook().getPrice()){
//							return this.getBook().getName().compareTo(p.getBook().getName());
//						}
//						return (int)(this.getBook().getPrice()-p.getBook().getPrice());
//					}
//					return this.getName().compareTo(p.getName());
//				}
//				return this.getAge()-p.getAge();
//			}
//			return (int)(this.getSalary()-p.getSalary());
//		}
//		return 0;
//	}
	
}
