package com.sist.exam12;

public class CountDownEvent extends Thread {
	private int delay;
	private String msg;

	public CountDownEvent(int delay,String msg) {
		this.delay = delay*1000; //3�� �Է¹޾����� 3�ʰ� �ǰ� 1000�� �����ش�
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
