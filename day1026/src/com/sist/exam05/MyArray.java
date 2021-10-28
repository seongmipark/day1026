package com.sist.exam05;

import java.util.Scanner;

public class MyArray {
	public int []data;
	public MyArray() {
		
		try {
		data = new int[10];
		//data = new int[0];  ArithmeticException�߻�
		//data = new int[-10]; //NegativeArraySizeException�߻�
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i <= data.length ; i++ ) {
			System.out.printf("%d��°�� �����͸� �Է��ϼ���==>",i+1);
			data[i] = sc.nextInt();
		}
		}catch(NegativeArraySizeException e) {
			System.out.println("���ܹ߻� : �迭�� ũ��� ������ �� �� �����.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻� : �ε��� ������ �Ѿ����ϴ�.");
		}catch(NullPointerException e) {
			System.out.println("���ܹ߻� : �����Ͱ� �������� �ʾҽ��ϴ�.");
		}
	}
	
	
	public double getAverage() {
		double avg=0;
		int sum = 0;
		
		try {
		//for(int i=0;i<=data.length;i++) { //�迭�� �����;�����, �ε��������� ������ ���ܹ߻�
		for(int i=0;i<data.length;i++) { 
			sum += data[i];
		}
		avg = sum / data.length;	//�迭�� ���̰� 0�̸� ���ܹ߻�	
		return avg;
	}catch(ArithmeticException e) {
		System.out.println("�迭�� �����Ͱ� �ϳ��� �����!");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("���ܹ߻� : �ε��� ������ �Ѿ����ϴ�.");
	}catch(NullPointerException e) {
		System.out.println("���ܹ߻� : �����Ͱ� �������� �ʾҽ��ϴ�.");
	}
		return avg;
	}

}
