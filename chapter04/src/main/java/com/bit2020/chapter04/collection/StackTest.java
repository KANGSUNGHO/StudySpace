package com.bit2020.chapter04.collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		
		s.push("둘리");
		s.push("마이클");
		s.push("또치");
		
		while(!s.isEmpty()) {
			String str = s.pop();
			System.out.println(str);
		}
		
		// 비어있는 경우 Exception 발생
		// s.pop();
		
		s.push("둘리");
		s.push("마이클");
		s.push("또치");
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
	}
}
