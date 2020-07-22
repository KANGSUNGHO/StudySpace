package com.bit2020.chapter03.person;

public class Person {
	private String name;
	protected int height;
	public int weight;
	
	public Person() {
		System.out.println("Person() called");
	}
	
	public Person(String name) {
		this.name = name;
	}
}
