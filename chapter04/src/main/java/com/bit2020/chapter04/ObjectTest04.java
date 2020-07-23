package com.bit2020.chapter04;

public class ObjectTest04 {

	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.hashCode() + ":" + s2.hashCode()); // String은 equals와 hashCode가 오버라이딩 되어있음.
	// 해시코드를 오버라이딩 하면 내용기반으로 되고 원본은 주소기반임.
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2)); // 주소 기반의 해시코드 
		
		System.out.println("=======================");
		
		String s3 = "ABC"; // => new String("ABC");
		String s4 = "ABC"; // => new String("ABC");
		// String 선언할 때 String s4 = "ABC" 이렇게 써주는게 좋음. new() 쓰면 안좋음.
		System.out.println(s3 == s4); 
		System.out.println(s3.equals(s4)); // true
		System.out.println(s3.hashCode() + ":" + s4.hashCode()); // String은 equals와 hashCode가 오버라이딩 되어있음.
	// 해시코드를 오버라이딩 하면 내용기반으로 되고 원본은 주소기반임.
		System.out.println(System.identityHashCode(s3)+ ":" + System.identityHashCode(s4)); // 주소 기반의 해시코드 
		

	}

}
