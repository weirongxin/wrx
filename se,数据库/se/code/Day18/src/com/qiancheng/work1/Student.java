package com.qiancheng.work1;

public class Student implements Comparable{
	private String name;
	private float height;
	private float weight;
	private int score;
	public Student() {
		super();
	}
	public Student(String name, float height, float weight, int score) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", height=" + height + ", weight=" + weight + ", score=" + score + "]";
	}
	@Override
	//比较条件：先以成绩排序、再身高排序、以体重排序、以名字排序
	public int compareTo(Object o) {
		if(o instanceof Student){
			Student stu = (Student)o;
			if(this.getScore()==stu.getScore()){
				if(this.getHeight()==stu.getHeight()){
					if(this.getWeight()==stu.getWeight()){
						return this.getName().compareTo(((Student) o).getName());
					}
					return (int)(this.getWeight()-stu.getWeight());
				}
				return (int)(this.getHeight()-stu.getHeight());
			}
			return this.getScore()-stu.getScore();
		}
		return 0;
	};
	
}
