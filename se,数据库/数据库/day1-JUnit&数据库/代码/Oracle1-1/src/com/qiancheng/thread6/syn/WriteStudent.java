package com.qiancheng.thread6.syn;

public class WriteStudent extends Thread {
	Student stu;
	public WriteStudent() {
		super();
	}
	public WriteStudent(Student stu) {
		super();
		this.stu = stu;
	}

	@Override
	public void run() {
		super.run();
		int i = 0;
		while(true){
			//线程安全锁，锁住stu对象
			//锁住对象后，只有当前线程可操作，其他线程不能对该对象执行读写
			//当synchronized代码块执行完成后，线程安全锁自动释放
			synchronized(stu){
				if(i%2==0){
					stu.setName("Girl");
					stu.setGender("女");
				}else{
					stu.setName("Boy");
					stu.setGender("男");
				}
			}
			i++;
		}
		
	}

}
