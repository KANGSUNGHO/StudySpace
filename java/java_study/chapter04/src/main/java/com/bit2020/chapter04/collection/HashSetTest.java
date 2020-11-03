package com.bit2020.chapter04.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>(); // set은 순서가 없고 순회만 할 수 있음. 중복이 없음.
		
		String s1 = new String("또치");
		String s2 = new String("또치");
		
		s.add("둘리");
		s.add("마이콜");
		s.add("또치");
		s.add(s1);
		s.add(s2);
		
		System.out.println(s.size());
		System.out.println(s.contains(s2));
		
		// 삭
		System.out.println(s.remove(s2));
		
		// 순회1
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		// 순회2
		for(String str : s) {
			System.out.println(str);
		}

	}

}
