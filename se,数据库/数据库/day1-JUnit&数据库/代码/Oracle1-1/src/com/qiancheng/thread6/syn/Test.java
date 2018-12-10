package com.qiancheng.thread6.syn;

public class Test {

	public static void main(String[] args) {
		Student s = new Student("Girl", "Ů");
		ReadStudent read = new ReadStudent(s);
		WriteStudent write = new WriteStudent(s);
		
		read.start();
		write.start();
	}

}
