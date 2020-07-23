package com.bit2020.chapter03.person;

public class TestStudent {

	public static void main(String[] args) {
		Student s = new Student();
		
		Person p = s; // 다운캐스팅, implicity(암시적)
		Student s2 = (Student)p; // 업캐스팅, explicity(명시적)

	}

}
