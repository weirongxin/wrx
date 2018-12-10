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
		//重写equals方法 添加自定义比较条件
		//如果当前对象的身份证号 和 参数的相同 则是同一个对象，否则为不同对象 
		if(obj instanceof Person){
			Person p = (Person)obj;
			return this.no==p.no;
		}
		return super.equals(obj);
	}
	
	
	
}
