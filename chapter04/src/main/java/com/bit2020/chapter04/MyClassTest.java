package com.bit2020.chapter04;

public class MyClassTest {

	public static void main(String[] args) {
//		MyClass myclass = new MyClass(); // X
		MyClass myclass = MyClass.getInstance();
// new()를 하지않고 팩토리메소드를 통해 구현할때 getInstance()사용.
		System.out.println(myclass);
	}

}
