package com.qiancheng.tools2;

public class Person {
	private int no;

	public Person() {
		super();
	}

	public Person(int no) {
		super();
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public boolean equals(Object obj) {
		//��дequals���� ����Զ���Ƚ�����
		//�����ǰ��������֤�� �� ��������ͬ ����ͬһ�����󣬷���Ϊ��ͬ���� 
		if(obj instanceof Person){
			Person p = (Person)obj;
			return this.no==p.no;
		}
		return super.equals(obj);
	}
	
	
	
}
