package com.qiancheng.tools3;

public class Student {
	private String name;
	private String gender;
	private float height;
	private float weight;
	
	public Student() {
		super();
	}
	public Student(String name, String gender, float height, float weight) {
		super();
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	@Override
	public boolean equals(Object obj) {
		//先判断参数是否为当前类的对象
		if(obj instanceof Student){
			//将参数 对象转换为子类类型的
			Student stu = (Student)obj;
			if(this.name.equals(stu.name)){
				if(this.gender.equals(stu.gender)){
					if(this.height==stu.height){
						if(this.weight == stu.weight){
							return true;
						}
					}
				}
			}
		}
		return super.equals(obj);
	}
	 
	
	
	
}
