package com.sist.exam11;

import com.sist.exam12.CountDownEvent;

public class CountDownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDown c = new CountDown(20);
		
		Thread t = new Thread(c);
		t.start();
		
		//new Thread(c).start(); //���� ������ ���ٷ� ǥ��
	}

}
