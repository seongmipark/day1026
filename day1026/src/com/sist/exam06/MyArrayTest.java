package com.sist.exam06;

public class MyArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		MyArray array = new MyArray();//생성시 배열값 입력
		System.out.println("배열의 평균:"+array.getAverage());
	}catch(NegativeArraySizeException e) {
		System.out.println("예외발생 : 배열의 크기는 음수가 될 수 없어요.");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("예외발생 : 인덱스 범위를 넘었습니다.");
	}catch(NullPointerException e) {
		System.out.println("예외발생 : 데이터가 생성되지 않았습니다.");
	}
}
}

