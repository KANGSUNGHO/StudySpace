package com.bit2020.chapter03.person;

public class Student extends Person {
	public void test() {
		// 자식에서는 부모의 private 필드나 메소드 접근 불
		//name = "둘리";
		// 자식에서는 부모의 protected 필드나 메소드 접근 가능 
		height = 140;
		// 자식에서는 부모의 public 필드나 메소드 접근 가능 
		weight = 30;
		
	}

}
