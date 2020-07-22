package com.bit2020.paint;

public class MainApp {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		Point point1 = new Point();
		point1.setX(x);
		point1.setY(y);
		
		Point point2 = new Point(50,50);
		
		drawPoint(point1);
		drawPoint(point2);

	}
	
	public static void drawPoint(Point pt) {
		pt.show();
	}

}
