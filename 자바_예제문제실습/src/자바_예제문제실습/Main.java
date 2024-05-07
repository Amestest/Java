package 자바_예제문제실습;

import java.util.Scanner;

/*
 사용자에게 문자열을 입력 받아 문자여르이 길이르 ㄹ출력하기
 입력한 문자열이 finish 면 프로그램을 종료하게 하길 원함
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("문자열을 입력해주세요.");
			String str = sc.nextLine();
			if(str == "finish") {//finish 넣었을 때 멈추게 변경
					
				break;
			} else {
				System.out.println(str.length() + "글자 입니다.");
				//.length() 문자열에 대한 글자수 반환 메서드
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
