package com.qiancheng.thread6.syn;

public class ReadStudent extends Thread {
	Student stu;
	public ReadStudent(Student stu) {
		super();
		this.stu = stu;
	}

	@Override
	public void run() {
		super.run();
		
		while(true){
			synchronized(stu){
				System.out.println("Ãû×Ö£º"+this.stu.getName());
				System.out.println("ĞÔ±ğ"+this.stu.getGender());
			}
			
		}
		
	}

}
