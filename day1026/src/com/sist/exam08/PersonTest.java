package com.sist.exam08;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동");
		Person p2 = new Person("유관순");
		Person p3 = new Person("김유신");

		//p1.start();
		//p2.start();
		//p3.start();
		
		p1.run();
		p2.run();
		p3.run();
		
		//쓰레드를 가동(동시에 공평하게 실행) 시키려면 "start()"메소드 호출
		//그런데 start를 호출하지 않고 run()을 직접 호출하면
		//스레드가 가동(공평하게 실행) 되지 않고 일반메소드처럼 
		//호출순서대로 실행된다.
	}

}
