package com.kh.test.main;

public class Test9 {
	public static void main(String[] args) {
		String[] 요일 = {"월","화","수"};
		for(String 날짜 : 요일) {
			System.out.println(날짜);
		}
		//length 는 장바구니 같은 배열에 들어잇느 ㄴ개수
		System.out.println(요일.length);
		//index로 각 자길에 어던 값이 들어있는지 확인하고 싶다면
		// 변수명[알고싶은숫자]
		System.out.println(요일[0]);
		System.out.println(요일[1]);
		System.out.println(요일[2]);
		
		
		//인덱스 이용해서 요일 1 번의 자리에 있는 값
		//인덱스 이용해서 요일 2 번의 자리에 있는 값		
	}
}
