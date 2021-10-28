package com.sist.exam10;

public class CountDown extends Thread {
	private int second;
	public CountDown(int second) {
		this.second = second;
	}
		
	@Override
	public void run() {
		for(int i=20;i>0;i--) {
			System.out.println(i+"초 전입니다.");
			try {
			Thread.sleep(1000);
			}catch(Exception e) {
			}
		}
	}	
}
