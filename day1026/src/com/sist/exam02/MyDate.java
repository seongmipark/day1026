package com.sist.exam02;

import java.util.StringTokenizer;

public class MyDate {
	private int year;
	private int month;
	private int date;
	public MyDate(String data) throws IlleagalArgumentException{//문자열은 "년/원/일"형태
		
		if(data == null) {
			throw new IlleagalArgumentException("날짜 데이터가 전달되지 않았습니다.");
		}
		StringTokenizer st = new StringTokenizer(data,"/");
		year =Integer.parseInt(st.nextToken()); //문자열을 정수로 받고싶다면 Integer.parseInt(data)
		month =Integer.parseInt(st.nextToken());
		date =Integer.parseInt(st.nextToken());
		}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDate() {
		return date;
	}

}
