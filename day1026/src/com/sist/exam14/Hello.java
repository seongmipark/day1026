package com.sist.exam14;

import java.util.Date;

public class Hello extends Thread {
	
	private int second;

		
	@Override
	public void run() {
			
		while(true) {
			Date today = new Date();
			System.out.println(today+" æ»≥Á«œººø‰?");
			try {
			Thread.sleep(1000);
			}catch(Exception e) {
			}
		}
		}
	}	

