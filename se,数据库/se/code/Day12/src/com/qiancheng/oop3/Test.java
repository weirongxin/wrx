package com.qiancheng.oop3;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Student[] students = new Student[10]; 
		//ʵ����3����ͨѧ����ӵ�������
		for(int i=0;i<3;i++){
			students[i] = new Student();
		}
		//ʵ����4�� ѧ�����������ӵ�ѧ��������
		for(int i=3;i<7;i++){
			Sister sister = new Sister();
			sister.setSound("����");
			//��ѧ����������ӵ�Ϊ  �������
			//�������͵�����ת��
			students[i] = sister;
		}
		//ʵ����3�� ѧ�����������ӵ�ѧ��������
		for(int i=7;i<10;i++){
			Brother b = new Brother();
			b.setSound("һ��һ");
			//��ѧ����������ӵ�Ϊ  �������
			//�������͵�����ת��
			students[i] = b;
		}
		
		Random ran = new Random();
		int randomNum = ran.nextInt(students.length);
		Student stu = students[randomNum];
		
		Test t = new Test();
		t.method(stu);
	}
	//���ܷ���  �����Ϊѧ������
	public void method(Student stu){
		//ѧ�����й��еĹ���  ���ں�
		stu.speak();
		//�����ж�  �����ж��й��ܵĵ���
		if(stu instanceof Sister){
			Sister s = (Sister)stu;
			s.dance();
		}else if(stu instanceof Brother){
			Brother b = (Brother)stu;
			b.run();
		}
	}

}
