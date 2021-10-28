package com.sist.exam04;

import java.util.Scanner;

public class DivideByZeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2, result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수:");
		number1 = sc.nextInt();
		
		System.out.println("첫번째 정수:");
		number2 = sc.nextInt();
		
		result = number1/number2;
		System.out.println(result);
		
		//20,5 입력 : 4 출력
		//20, abc 입력 : InputMismatchException예외발생 , 자료형이 맞지않음//20,5 입력 : 4 출력
		//20,0 입력 : ArithmeticException예외 발생 , 0으로 나눌수없다
		
	}

}
