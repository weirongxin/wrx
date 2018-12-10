package com.homework1;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	public MyTime() {
		super();
	}
	public MyTime(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public String toString(){
		return hour+"Ê± "+minute+"·Ö "+second+"Ãë";
	}
}
