package com.kh.test.main;

public class Test7 {
	public static void main(String[] args) {
		//배열에 들어잇는 데이터 중 홀수의 값들을 출력하고 합을 구한다.
		//단, continue를 이용하여 작성한다.
		
		int[] 배열 = {1,2,3,4,5,6,7,8,9,10};
		double 합 = 0;
		
		
		//for each 문을 사용해서 모두 돌고
		
			//if 문을 사용해서 % 2 != 0  아니면 +=해주기
		
		//합계 출력하기
		for(int 숫자 :배열) {
			/*
			  숫자 % 2 == 0 짝수구하기
			  숫자 % 2 != 0 홀수구하기
			*/					
			if(숫자 % 2 != 0) {
				System.out.println(숫자);	
				합 += 숫자;
			}
		
		}
		System.out.println("합계 : " + 합);
	}
}
