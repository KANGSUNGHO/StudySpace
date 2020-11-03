package com.bit2020.chapter04;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('A');
		Boolean b = new Boolean(true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);
		
		// Auto Boxing을 지원해줌. => 기본 데이터 타입을 Wrapper 클래스로 변환하는 것을 boxing이라고 함. 반대의 경우는 unboxing
		Integer j1 = 10;
		Integer j2 = 10;
		
		System.out.println(j1 + j2);
		System.out.println(j1 == j2);
		
		
		System.out.println(j1 == 10);
		
		// Auto UnBoxing을 지원해줌.
//		int j3 = j2.intValue();
		int j3 = j2;
		System.out.println(j1 == j2);
		
		System.out.println(j3);
	}

}
