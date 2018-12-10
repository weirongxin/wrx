package com.qiancheng.work2;

public class Computer {

	public static void main(String[] args) {
		CPU cpu = new IntelCpu();
		VideoCard card = new DmengVideoCard();
		Mainboard board = new Mainboard(card, cpu);
		
		Computer com = new Computer();
		com.openPC(board);
		com.closePC(board);
	}
	public void openPC(Mainboard board){
		board.run();
	}
	public void closePC(Mainboard board){
		board.close();
	}
	

}
