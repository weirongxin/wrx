package com.qiancheng.homework2;
//���һ����Student���������������ѧ�źͳɼ���
//���һ�����������ճɼ��Ӹߵ��͵�˳�����������ѧ�źͳɼ���Ϣ��
//��֪ʶ�㣺����Ĵ�����ʹ�� ��ʾ���������������������Ƕ��������ֵ
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
