package com.bit2020.chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10,20);
		
		System.out.println(p.getClass()); // reflection
		System.out.println(p.hashCode()); // reference value x
										  // address         x
										  // address 기반의 해싱 
		System.out.println(p); // p의 toString()을 부름.
		System.out.println(p.toString()); //getClass() + "@" + hashCode()

	}

}
