package com.bit2020.chapter03;

public class StativMethodTest {

	public static void main(String[] args) {
		int a = Math.abs(-1);
		int b = Math.max(10, 20);
		
		StaticMethod.s1();
		
		System.out.println(a + ":" + b);

	}

}
