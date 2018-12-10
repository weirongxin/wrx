package com.qiancheng.work2;

public class IntelCpu implements CPU {
	public IntelCpu() {
		System.out.println("Make an Intel's CPU");
	}
	@Override
	public void cpuRunning() {
		System.out.println("cpu running");
	}

	@Override
	public void cpuClosing() {
		System.out.println("cpu closing");
	}

}
