package com.sist.exam02;

//mydate 객체 생성 시에 문자열이 null이면 예외발생
public class IlleagalArgumentException extends Exception {
	public IlleagalArgumentException(String msg) {
		super(msg);
	}
}
