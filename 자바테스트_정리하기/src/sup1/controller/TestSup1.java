package sup1.controller;

import java.util.Scanner;

import sup1.model.Score;

public class TestSup1 {
	public static void main(String[] args) {
		//스캐너 이용해서
		  Scanner sc = new Scanner(System.in);
		  //국어점수 영어점수 수학점수 입력밥ㄷㄷ고
		  System.out.print("국어점수 : ");
		  int kor = sc.nextInt();
		  System.out.print("영어점수 : ");
		  int eng = sc.nextInt();
		  System.out.print("수학점수 : ");
		  int math = sc.nextInt();
		  Score 점수 = new Score(kor,eng,math);

}
	
}
