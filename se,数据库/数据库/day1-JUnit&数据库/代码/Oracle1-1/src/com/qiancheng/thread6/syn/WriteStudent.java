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
			//�̰߳�ȫ������סstu����
			//��ס�����ֻ�е�ǰ�߳̿ɲ����������̲߳��ܶԸö���ִ�ж�д
			//��synchronized�����ִ����ɺ��̰߳�ȫ���Զ��ͷ�
			synchronized(stu){
				if(i%2==0){
					stu.setName("Girl");
					stu.setGender("Ů");
				}else{
					stu.setName("Boy");
					stu.setGender("��");
				}
			}
			i++;
		}
		
	}

}
