package com.qiancheng.homework2;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int width = scanner.nextInt();
		
		Rectangle get = new Rectangle(length,width);
		get.showAll();
		scanner.close();
	}
}
