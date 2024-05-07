package com.kh.test.main;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		// while문 이용해서1부터 100까지의 모든 정수들의 합과 평균 구하기
		int 시작숫자 = 1;
		int 숫자합 = 0;
		int 카운트 = 0; // 반복한 횟수 몇번 반복햇는지 확인
		
		
		//while
		while(시작숫자 <= 100) {
			숫자합 += 시작숫자;
			카운트++;
			시작숫자++;
		}
		
		//평균구하기
		double 평균 = (double) 숫자합 / 카운트;
		// 숫자합과 평균출력하기
		System.out.println("합계 : " +숫자합);
		System.out.println("평균 : " +평균);
		
		
		
		
		
		//while문을 사용해서 switch 문 계속 숫자 작성하게 만들어주고
		// case 3 : 종료 만들어주기 return;
			
		//switch case 문 실행해보기
		Scanner 스캐너 = new Scanner(System.in);
		String 할일 = "";
		//while에 true 대신에 true가 담겨져 있는 변수를 하나 만들어주고
		//qustnrkqtdmf true -> false 로 만들어준 후 종료시키키
	boolean 계속 = true;
		
	while(계속) {
		System.out.println("숫자 작성");
		int 날짜 = 스캐너.nextInt(); //숫자를 받는 스캐너 작성
		
		
		switch(날짜) {
		case 1:
			할일 = "월요일 : 업무";
			break;
		case 2:
			할일 = "화요일 : 공부";
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			//return;
			계속 = false;
			break;
		default : 
			할일 = "날짜와 관계없이 휴식";
			break;
		}
		
		System.out.println("일정 : " + 할일);
	}
  }
}