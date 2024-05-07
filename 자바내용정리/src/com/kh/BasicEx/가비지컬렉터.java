package com.kh.BasicEx;


//안쓰는 것 청소해서 정리하기
/*
  
 Garbage = 쓰레기
 Collection = 수집
  
  더이상 사용되지 않는 객체나 변수를 자동으로 졍리하는 방식
  */
public class 가비지컬렉터 {
	//main 메서드 들어가진어ㅔ 작성하는 변수가 전역변수
	//필드
	/*--------------↑↑↑↑-----------------*/
	public static void main(String[] args) {
		//지역변수 {} 안에 들어와서 작성을 했기 때문
		String 주소 = "https://";
		System.out.println(주소);
		주소 += "www.naver.com";
		System.out.println(주소);
	}
}







