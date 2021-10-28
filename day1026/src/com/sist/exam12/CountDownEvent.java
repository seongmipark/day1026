package com.sist.exam12;

public class CountDownEvent extends Thread {
	private int delay;
	private String msg;

	public CountDownEvent(int delay,String msg) {
		this.delay = delay*1000; //3을 입력받았을때 3초가 되게 1000을 곱해준다
		this.msg = msg;
	}
	
	public void run(){
				try {
					Thread.sleep(1000);
					}catch(Exception e) {
					}
				System.out.println(msg);
		}
}
