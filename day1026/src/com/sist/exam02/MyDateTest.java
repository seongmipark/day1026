package com.sist.exam02;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String data = null;
			MyDate lastdate = new MyDate(data);
			int year = lastdate.getYear();
			int month = lastdate.getMonth();
			int date = lastdate.getDate();
			System.out.printf("�������� %d�� %d�� %d�� �Դϴ�.",year,month,date);
			
			
		}catch(IlleagalArgumentException e){
			//System.out.println("���ܹ߻�: "+e.getMessage());
			e.printStackTrace();
	}

}
	
}
