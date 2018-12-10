package com.qiancheng.work2;

public class Mainboard {
	private VideoCard card;
	private CPU cpu;
	
	public Mainboard(){}
	public Mainboard(VideoCard card,CPU cpu){
		this.card = card;
		this.cpu = cpu;
	}
	public VideoCard getCard() {
		return card;
	}
	public void setCard(VideoCard card) {
		this.card = card;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}  
	//�����尴ť  ͬʱ��cpu���Կ�
	public void run(){
		this.cpu.cpuRunning();
		this.card.videoRunning();
	}
	public void close(){
		this.cpu.cpuClosing();
		this.card.videoClosing();
	}
}
