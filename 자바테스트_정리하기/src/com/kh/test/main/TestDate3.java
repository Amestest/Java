package com.kh.test.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestDate3 {
	
	public static void main(String[] args) {
		//본인의 생년 월일 설정
		int 태어난년도 = 1989;
		int 태어난월 = 5;
		int 태어난날짜 = 25;
	
		//현재 날짜 구하기
		Calendar 현재 = Calendar.getInstance();
		int 현재년도 = 현재.get(Calendar.YEAR);
		int 현재월 = 현재.get(Calendar.MONTH) + 1;
		int 현재날짜 = 현재.get(Calendar.DAY_OF_MONTH) + 1;
	
		//나이 계산
		int 나이 = 현재년도 - 태어난년도;
		
		//생일 전 나이면 나이 -1
		//만약에 현재는 4월인데 내 생일 8월 14일
		// 	4   <  8 		또는 8      8			3			14
		if(현재월 < 태어난월 || (태어난월 == 현재월 && 현재날짜 < 태어난날짜)) {
			나이--;
			
		}
		//생일 요일 계산
		Calendar 생일 = new GregorianCalendar(태어난년도,태어난월 -1,태어난날짜);
		SimpleDateFormat 날짜예쁘게작성 = new SimpleDateFormat("yyyy년 M월 d일 EEEE");
	
		//출력
		System.out.println("생일 : " + 날짜예쁘게작성.format(생일.getTime()));
		System.out.println("현재 : " + 날짜예쁘게작성.format(현재.getTime()));
		System.out.println("나이 : " + 나이 + " 세 ");
	
	}
}
