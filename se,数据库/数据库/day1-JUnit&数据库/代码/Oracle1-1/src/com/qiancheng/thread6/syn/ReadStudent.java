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
				System.out.println("���֣�"+this.stu.getName());
				System.out.println("�Ա�"+this.stu.getGender());
			}
			
		}
		
	}

}
