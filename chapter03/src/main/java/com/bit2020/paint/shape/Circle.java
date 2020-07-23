package com.bit2020.paint.shape;

public class Circle extends Shape {
	private int x1;
	private int y2;
	private int radius;
	

	@Override
	public void draw() {
		System.out.println("원을 그렸습니다.");

	}
	@Override
	public int calcPerimeter() {
		return (int)(radius*2*Math.PI);
	}

}
