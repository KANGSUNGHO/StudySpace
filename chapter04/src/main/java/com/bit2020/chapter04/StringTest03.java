package com.bit2020.chapter04;

public class StringTest03 {

	public static void main(String[] args) {
//		String str = "Hello" + "World" + "Java" + 1000;
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World");
		sb.append("Java");
		sb.append(1000);
		sb.toString();
		
		String str = new StringBuffer("Hello")
					.append("World")
					.append("java")
					.append(1000)
					.toString();
		
		System.out.println(str);
		System.out.println(sb);
		
		// 주의 문자열 + 연산
		String str2 = "";
//		for(int i = 0; i < 1000000; i++) {
//			str2 += i;
////			str2 = new StringBuffer(str2).append(i).toString();
//		} // String에서 +연산을 사용할 때 반복하는 경우 위보다 아래의 방법을 사용해야함.
		
		StringBuffer sb1 = new StringBuffer("");
		for(int i = 0; i < 1000000; i++) {
			sb1.append(i);
		}
		
		str2 = sb1.toString();
		

	}

}
