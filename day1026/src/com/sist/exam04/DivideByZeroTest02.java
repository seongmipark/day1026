package com.sist.exam04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		int number1, number2, result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ����:");
		number1 = sc.nextInt();
		
		System.out.println("ù��° ����:");
		number2 = sc.nextInt();
		
		result = number1/number2;
		System.out.println(result);
	}catch(InputMismatchException e){
		//System.out.println("���ܹ߻�:"+e.getMessage());
		e.printStackTrace();
	}catch(ArithmeticException e){
		//System.out.println("���ܹ߻�:"+e.getMessage());
		e.printStackTrace();
	}finally {
		System.out.println("�۾��Ϸ�");
	}
		
	}
		//20,5 �Է� : 4 ���
		//20, abc �Է� : InputMismatchException���ܹ߻� , �ڷ����� ��������//20,5 �Է� : 4 ���
		//20,0 �Է� : ArithmeticException���� �߻� , 0���� ����������
		
	}

