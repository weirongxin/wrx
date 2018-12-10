package com.qiancheng.oop2;

public class Test {

	public static void main(String[] args) {
		//抽象类和接口，不能直接实例化
		//可以在实例化过程中，将抽象方法实现，则能够创建对象
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
