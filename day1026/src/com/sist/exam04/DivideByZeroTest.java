package com.sist.exam04;

import java.util.Scanner;

public class DivideByZeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2, result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ����:");
		number1 = sc.nextInt();
		
		System.out.println("ù��° ����:");
		number2 = sc.nextInt();
		
		result = number1/number2;
		System.out.println(result);
		
		//20,5 �Է� : 4 ���
		//20, abc �Է� : InputMismatchException���ܹ߻� , �ڷ����� ��������//20,5 �Է� : 4 ���
		//20,0 �Է� : ArithmeticException���� �߻� , 0���� ����������
		
	}

}
