package com.bit2020.chapter03.swap;

public class SwapTest03 {

	public static void main(String[] args) {
		Value a = new Value(10);
		Value b = new Value(20);
		
		System.out.println(a.val + ":" + b.val);
		swap(a,b); //call by reference
		System.out.println(a.val + ":" + b.val);
		
	}
	public static void swap(Value m, Value n) {
		int temp = m.val;
		m.val = n.val;
		n.val = temp;
	}

}
