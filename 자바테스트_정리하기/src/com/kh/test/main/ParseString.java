package com.kh.test.main;

public class ParseString {
	public static void main(String[] args) {
		String str1 = "123";
		int num1 = Integer.parseInt(str1);
		System.out.println("문자열을 정수로 변환한 결과 : " + num1);
		
		String str2 = "123.45";
		double num2 = Double.parseDouble(str2);
		System.out.println("문자열을 실수로 변환한 결과 : " + num2);
		
		//정수를 문자열로 변환
		int num3 = 123;
		String str3 = Integer.toString(num3);
		System.out.println("정수를 문자열로 변환한 결과 : " + str3);
		
		
		//실수를 문자열로 변환
		double num4 = 123.45;
		String str4 = Double.toString(num4);
		System.out.println("실수를 문자열로 변환한 결과 : " + str4);
		
	}
}
