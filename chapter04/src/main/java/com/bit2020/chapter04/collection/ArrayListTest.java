package com.bit2020.chapter04.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("둘리");
		list.add("마이");
		list.add("도넛");
		
		// 순회1
		int count = list.size();
		for(int i =0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		// 삭제
		list.remove(1);
		
		// 순회
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		// 순회3(for~each) => 순회 3 이 소스 가독성이 좋음.
		for(String s : list) {
			System.out.println(s);
		}

	}

}
