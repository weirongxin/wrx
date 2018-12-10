package com.math.aspectfunc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Math math = (Math) con.getBean("math");
		
		int sum = math.add(1, 2);
		System.out.println(sum);
	}

}
