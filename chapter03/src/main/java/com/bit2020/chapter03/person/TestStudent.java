package com.bit2020.chapter03.person;

public class TestStudent {

	public static void main(String[] args) {
		Student s = new Student();
		
		Person p = s; // 업 캐스팅, explicity(명시적)
		Student s2 = (Student)p; // 다운 캐스팅, implicity(암시적)

	}

}
