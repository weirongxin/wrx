package com.wanghua.dvd;

public class DVD {
	private String name;
	private int state = 1;//0���Ѿ����  1�����Խ�   
	private int date = 0;
	private int count = 0;
	public DVD(){
		
	}
	public DVD(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	/**
	 * �жϵ�ǰ�Ƿ���Խ�DVD
	 * @return
	 */
	public boolean canBorrow(){
		if(this.state == 1)
			return true;
		return false;
	}
	/**
	 * ��dvd����Ϊ���״̬
	 */
	public void borrowDvd(){
		this.state = 0;
	}
	/**
	 * �黹DVD
	 */
	public void backDvd() {
		this.state = 1;
	}
}
