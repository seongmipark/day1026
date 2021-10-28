package com.sist.exam09;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("최현호");
		Person p2 = new Person("윤태인");
		//p.start();
		//Runnable 인터페이스에는 start메소드가 없다
		//Thread 객체로 포장해서 start()를 호출
		/*
		Thread t = new Thread(p);
		Thread t2 = new Thread(p2);
		t.start();
		t2.start();*/
		
		new Thread(p).start();
		new Thread(p2).start();
	}

}
