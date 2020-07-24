package com.bit2020.chapter04.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("one", 1); // auto boxing
		map.put("two", 2);
		map.put("three", 3);
		
		int i = map.get(new String("two")); // auto unboxing
		int j = map.get("one");
		
		System.out.println(i + ":" + j);
		
		map.put("three", 33333); // 이미 있는 키에 값을 또 넣음.
		System.out.println(map.get("three")); // 데이터 값이 변경됨.
		
		
		// 순회
		
	}

}
