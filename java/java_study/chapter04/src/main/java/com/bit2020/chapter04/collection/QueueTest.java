package com.bit2020.chapter04.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		q.offer("둘리");
		q.offer("마이클");
		q.offer("또치");
		
		while(!q.isEmpty()) {
			String s = q.poll();
			System.out.println(s);
		}
		
		// 비어있는 경우 null이 나옴
		System.out.println(q.poll()); // null
		
		q.offer("둘리");
		q.offer("마이클");
		q.offer("또치");
		
		System.out.println(q.poll()); // poll은 큐에서 하나 빼옴.
		System.out.println(q.peek()); // 피클은 빼지 않고 뺄 항목을 보여
		System.out.println(q.poll());
	}

}
