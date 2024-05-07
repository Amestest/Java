package com.kh.BasicEx;

public class Memory {
	//컴퓨터에서 자바가 실행이 되고 자바를 실행하기 위한 공간이 생성
	public static void main(String[] args) {
		
		// 힙에는 내클래스 라는 객체가 생성
		MyClass  내클래스 = new MyClass();
		
		// 스택에는 main안에 작성이 되어있는 지역변수가 생성
		int x = 10;
		String name = "동그라미";
	}
}
