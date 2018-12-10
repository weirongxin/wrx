package com.qiancheng.dvdio;

import java.io.Serializable;

public class DVD implements Serializable{
	private static final long serialVersionUID = 8969134187496097614L;
	
	private String name;
	private String status;//���״̬
	private int count;//�������
	public DVD() {
		super();
	}
	public DVD(String name, String status, int count) {
		super();
		this.name = name;
		this.status = status;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "DVD [name=" + name + ", status=" + status + ", count=" + count + "]";
	}
	//���������ж�����dvd�Ƿ����
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof DVD){
			DVD d = (DVD)obj;
			return this.getName().equals(d.getName());
		}
		return super.equals(obj);
	}
	 
	
}
