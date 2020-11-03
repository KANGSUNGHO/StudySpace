package com.bit2020.chapter04;

public class StringTest02 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase();
		
		// String 메소드는 자기 자신을 변경시키지 않는다.
		
		String s4 = s2.concat("@");
		String s5 = "!".concat(s2).concat("@");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		// equals 메소드 주의할 점.
		System.out.println(equalsHello("Hello"));
		System.out.println(equalsHello("hello"));
		System.out.println(equalsHello(null));
	}
	
	public static boolean equalsHello(String s) {
//		return s.equals("Hello");
		return "Hello".equals(s); // 위에꺼보다는 아래 형태로 작성하는 것이 좋음. 위에꺼는 s에 null이 들어오면 NullPointerException이 발생하기 때
	}
}
