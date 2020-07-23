package com.bit2020.paint.shape;

public class Rect extends Shape{

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	@Override
	public void draw() {
		System.out.println("사각형을 그렸습니다.");
	}
	
	@Override
	public int calcPerimeter() {
		return (x2-x1)*2 + (y2-y1)*2;
	}
}
