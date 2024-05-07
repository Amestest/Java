package com.kh.test.main;

public class 객체힙스택1 {
	public static void main(String[] args) {
		Car 차1 = new Car();
		//내 컴퓨터에서 보는 주소이기 때문에 타인의 컴퓨터와 주소가 일치아지 않을 수 있음
		System.out.println("차1 : " + 차1);
		System.out.println(차1.get차모델이름());
		System.out.println(차1.get색상());
		System.out.println(차1.get모델년도());
		
		
		Car 차2 = new Car("소나타",2019,"화이트");
		System.out.println("차2 : " + 차2);
		System.out.println(차2.get차모델이름());
		System.out.println(차2.get색상());
		System.out.println(차2.get모델년도());
	}
}
