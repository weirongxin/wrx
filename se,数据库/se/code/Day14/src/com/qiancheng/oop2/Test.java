package com.qiancheng.oop2;

public class Test {

	public static void main(String[] args) {
		//������ͽӿڣ�����ֱ��ʵ����
		//������ʵ���������У������󷽷�ʵ�֣����ܹ���������
		Animal an = new Animal(){
			public void run(){
				System.out.println("----");
			}

			@Override
			public void run2() {
				System.out.println("run2");
			}
		};

		Animal an2 = new Animal(){
			public void run(){
				System.out.println("0000");
			}

			@Override
			public void run2() {
				System.out.println("run2");
			}
		};
		
		an.run();
		an2.run();
	}

}
