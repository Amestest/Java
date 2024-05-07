package com.kh.test.main;

import java.util.HashMap;
import java.util.Map;

public class MapPre {
	
	public static void main(String[] args) {
		//Map 또한 마찬가지로 인터페이스 이기 때문에
		// 인스턴스 느낌으로 상요하려면
		// Map<String,Integer> map = new HashMap<>(); 과 같이 사용해야함
		
		Map<String, Integer> map = new HashMap<>();
		// 순서 보장 X
		map.put("apple", 2000);
		map.put("banana", 3000);
		map.put("cherry", 1000);
		
		System.out.println(map);
		
		//주의!! " " 안에 스페이스 바(공백) 확인 순서보장 X
		map.put("banana", 500);
		System.out.println(map);
		
		map.put("banana ", 1000);
		System.out.println(map);
		map.put(" banana ", 1500);
		System.out.println(map);
	}
}
