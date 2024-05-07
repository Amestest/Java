package com.kh.BasicEx;

public class 가비지컬렉터그림판 {
	public static void main(String[] args) {
		String 휴대폰번호 = "010"; //가비컬렉션에 의해 Heap에서 사라짐
		System.out.println(휴대폰번호); // 가비지컬렉션에 의해 Heap에서 사라짐
		휴대폰번호 += "-1234-5678";
		System.out.println(휴대폰번호);
	}
}
