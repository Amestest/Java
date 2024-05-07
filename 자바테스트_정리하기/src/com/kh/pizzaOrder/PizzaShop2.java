package com.kh.pizzaOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PizzaShop2 {
	public static void main(String[] args) {
		//주문목록을 저장할 ArrayList
		List<PizzaOrder> 주문리스트 = new ArrayList<>();
		
		PizzaOrder 주문1 = new PizzaOrder("고영희", "페페로니");
		주문리스트.add(주문1);
		/*위에서 작성한 주문리스트와
		  밑에서 작성한 주문리스트는
		  주문을 작성ㅎ나 방식이 다를 뿐이지
		  동일하게 주문을 추가하는 바업*/
		//PizzaOrder 필수 생성자 이요해서 바로 입력
		//주문리스트.add(new PizzaOrder("고영희", "페페로니"));
		주문리스트.add(new PizzaOrder("박철진", "마르게리따")); 
		주문리스트.add(new PizzaOrder("안영식", "슈프림"));
		주문리스트.add(new PizzaOrder("고영희", "파인애플"));
		주문리스트.add(new PizzaOrder("박철진", "치즈"));
		  
		// 주문한 내용 전체 보기 toString
		//toString 추가로 어떤 출려긍ㄹ 진핸한다 하지 않아도 PizzaOrder에 작성한 자체가
		//정보를 정확하게 출력한다느 ㄴ의미로 표기됨
		System.out.println(주문리스트);
		
		//1개씩 보고 싶다면 for - each
		for(PizzaOrder 주문 : 주문리스트) {
			System.out.println(주문);
		}
		
		
		
		// HashSet 사용해서 중복 주문을 방지하기 위한 set  중복주문방지
				
		// 주문한 내용 전체 보기 toString
		
		// 중복된 주문 정보 제거한거 출력
		
	}
}
