package com.kh.test.main;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		/*
		 키보드로 1개의 정수형(int)		 	 
		 데이터를 입력 받아 1부터 5까지 일때만 해당 숫자에 해당하는 결과를 출력한다.
		 단, switch문을 이요한다
		switch case 문 작성
		1 : ** 입력이 정상적으로 되었습니다! **
		2 : ** 조회가 시작되었습니다! **
		3 : ** 수정이 정상적으로 되었습니다! **
		4 : ** 삭제가 정상적으로 되었습니다! **
		5 : ** 정상적으로 종료 되었습니다! **
		 */
		Scanner 스캐너 = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int 숫자 = 스캐너.nextInt();
		
		switch(숫자) {
		case 1:
			System.out.println("입력이 정성작으로 되었습니다.");
			break;
		case 2:
			System.out.println("조회가 시작었습니다.");
			break;
		case 3:
			System.out.println("수정이 정상적으로 되었습니다.");
			break;
		case 4:
			System.out.println("삭제가 정상적으로 되었습니다.");
			break;
		case 5:
			System.out.println("정상적으로 종료 되었습니다.");
			break;
		default :
				System.out.println("다시 입력해주세요");
			
		}
		
		
		
	}
}
