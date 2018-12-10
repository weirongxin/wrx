package com.qiancheng.work2;

public class DmengVideoCard implements VideoCard {
	public DmengVideoCard() {
		System.out.println("Make a Dmeng's VideoCard");
	}
	@Override
	public void videoRunning() {
		System.out.println("Dmeng video  runinng");
	}

	@Override
	public void videoClosing() {
		System.out.println("Dmeng video  closing");
	}

}
