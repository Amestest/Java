package com.kh.datePre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre3 {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy / MM / dd / E");
		//  System.out.println(sdf);  java.text.SimpleDateFormat@3d658514
	
		//sdf는 변환하고 싶은 규칙일 뿐이지 날짜를 가져올 수 있는 것은 아님
		String formatsdf = sdf.format(now);
		System.out.println(formatsdf);
		
		System.out.println("주민번호를 8자리 입력해주세요");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
		
		String formatsdf2 = sdf2.format(now);
		System.out.println(formatsdf2);
		
		
		
		System.out.println("주민번호를 6자리 입력해주세요");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyMMdd");
		String formatsdf3 = sdf3.format(now);
		System.out.println(formatsdf3);
	
		// yyyy   MM  dd   0000년   00월   00일
		//yyyyMMdd  0000년00월00일
		
		//yy MM dd 00년 00월 00일
		//yyMMdd 00년 00월 00일
		
		
		
	}
}
