package com.qiancheng.homework2;
//设计一个类Student，该类包括姓名、学号和成绩。
//设计一个方法，按照成绩从高到低的顺序输出姓名、学号和成绩信息。
//（知识点：对象的创建和使用 提示：将对象排序、排序条件是对象的属性值
public class Student {
	private String name;
	private int num;
	private int score;
	
	public Student() {
		super();
	}
	
	public Student(int score) {
		super();
		this.score = score;
	}
	public Student(String name, int num, int score) {
		super();
		this.name = name;
		this.num = num;
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String say(){
		return name+" "+num+" "+score+" ";
	}
	
}
