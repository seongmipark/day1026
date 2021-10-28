package com.sist.exam05;

import java.util.Scanner;

public class MyArray {
	public int []data;
	public MyArray() {
		
		try {
		data = new int[10];
		//data = new int[0];  ArithmeticException발생
		//data = new int[-10]; //NegativeArraySizeException발생
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i <= data.length ; i++ ) {
			System.out.printf("%d번째의 데이터를 입력하세요==>",i+1);
			data[i] = sc.nextInt();
		}
		}catch(NegativeArraySizeException e) {
			System.out.println("예외발생 : 배열의 크기는 음수가 될 수 없어요.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생 : 인덱스 범위를 넘었습니다.");
		}catch(NullPointerException e) {
			System.out.println("예외발생 : 데이터가 생성되지 않았습니다.");
		}
	}
	
	
	public double getAverage() {
		double avg=0;
		int sum = 0;
		
		try {
		//for(int i=0;i<=data.length;i++) { //배열에 데이터없을때, 인덱스범위를 넘을때 예외발생
		for(int i=0;i<data.length;i++) { 
			sum += data[i];
		}
		avg = sum / data.length;	//배열의 길이가 0이면 예외발생	
		return avg;
	}catch(ArithmeticException e) {
		System.out.println("배열의 데이터가 하나도 없어요!");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("예외발생 : 인덱스 범위를 넘었습니다.");
	}catch(NullPointerException e) {
		System.out.println("예외발생 : 데이터가 생성되지 않았습니다.");
	}
		return avg;
	}

}
