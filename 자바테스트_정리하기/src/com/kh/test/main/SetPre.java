package com.kh.test.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPre {

	public static void main(String[] args) {
		//set 같은 경우 인터페이스 이기 때문에 단독으로 사용을 하지는 못하지만
		// Set 셋 = new Set<>(): X 불가!!
		// Set 셋 = new HashSet<>(); O 가능!!
		
		Set<String> 셋1 = new HashSet<>();
		
		셋1.add("사과");
		셋1.add("바나나");
		셋1.add("오렌지");
		
		System.out.println("해시셋 : " + 셋1);
		
		
		Set<Integer> 셋2 = new TreeSet<>();
		
		셋2.add(5);
		셋2.add(2);
		셋2.add(8);
		
		System.out.println("트리셋 : " + 셋2);
		
		Set<String> 셋3 = new LinkedHashSet<>();
		
		셋3.add("영화");
		셋3.add("드라마");
		셋3.add("티비");
		
		System.out.println("링크드해시셋 : " + 셋3);
		
		//clear remove isEmpty
		
		//set get 사용해서 값을 수정하거나 가져올 수 없음
		
		
	}
}
