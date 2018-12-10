package com.qiancheng.homework;

public class Point {
	private int x;
	private int y;
	private int z;
	//构造方法
	public Point(){}
	public Point(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	//访问器方法
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	/**
	 * 点距离原点的距离的平方
	 * @return
	 */
	public int distance(){
		return this.x*this.x+y*y+z*z;
	}
}
