package com.kh.test.main;

import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
	/*
	 1부터 9까지 값을 스캐너로 각각 입력 받아
	 
	  더하기 빼기 곱하기 몱 출력하기
	  
	  int 숫자1
	  int 숫자2
	  */	
		Scanner 입력 = new Scanner(System.in);
		System.out.println("숫자1를 입력하세요");
		int 숫자1 = 입력.nextInt();
		if(숫자1 <1 || 숫자1 >9) {
			System.out.println("1부터 9사이의 정수를 입력하세요");
			return; //프로그램 종료
		}
		
		System.out.println("숫자2를 입력하세요");
		int 숫자2 = 입력.nextInt();
		if(숫자2 <1 || 숫자2 >9) {
			System.out.println("1부터 9사이의 정수를 입력하세요");
			return; //프로그램 종료
		}
				
		
		
		
		//합
		int 합 = 숫자1 + 숫자2;
		//빼기
		int 빼기 = 숫자1 - 숫자2;
		//곱하기
		int 곱 = 숫자1 * 숫자2;
		//나누기
		int 몱 = 숫자1/숫자2;
		
		System.out.println(숫자1 + " + " + 숫자2 + " = " + 합);
		System.out.println(숫자1 + " - " + 숫자2 + " = " + 빼기);
		System.out.println(숫자1 + " * " + 숫자2 + " = " + 곱);
		System.out.println(숫자1 + " / " + 숫자2 + " = " + 몱);
		}
	
	}

