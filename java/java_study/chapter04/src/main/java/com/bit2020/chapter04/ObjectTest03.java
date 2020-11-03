package com.bit2020.chapter04;

import java.util.HashSet;

public class ObjectTest03 {

	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		
		// 내용을 비교하고 싶으면 equals()를 오버라이딩 해줘야함.
		// equals() 메소드 오버라이딩 시에 hashCode()와 같이 오버라이딩 해줘야 함.
		HashSet<Point> set = new HashSet<Point>(); // Point 객체를 저장하는 set
		set.add(p1);
		System.out.println(set.size());
		set.add(p2);
		System.out.println(set.size());

	}

}
