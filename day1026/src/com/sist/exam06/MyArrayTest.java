package com.sist.exam06;

public class MyArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		MyArray array = new MyArray();//������ �迭�� �Է�
		System.out.println("�迭�� ���:"+array.getAverage());
	}catch(NegativeArraySizeException e) {
		System.out.println("���ܹ߻� : �迭�� ũ��� ������ �� �� �����.");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("���ܹ߻� : �ε��� ������ �Ѿ����ϴ�.");
	}catch(NullPointerException e) {
		System.out.println("���ܹ߻� : �����Ͱ� �������� �ʾҽ��ϴ�.");
	}
}
}

