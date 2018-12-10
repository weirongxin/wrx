package com.qiancheng.oop6;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Computer com = new Computer();
		//com.getElectric();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		com.fun(num);
	}
}
