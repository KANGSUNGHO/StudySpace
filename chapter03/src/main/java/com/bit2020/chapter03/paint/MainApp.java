package com.bit2020.chapter03.paint;

public class MainApp {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;

		Point point1 = new Point();
		point1.setX(x);
		point1.setY(y);

		Point point2 = new Point(50, 50);

		drawPoint(point1);
		drawPoint(point2);
		point1.show(false);

		System.out.println("=======================");

		Point point3 = new ColorPoint(); // 업캐스팅
		point3.setX(30);
		point3.setY(100);
		((ColorPoint) point3).setColor("red"); // 부모에서 자식접근할때는 명시적으로 해줘야함.

		drawPoint(point3);

		System.out.println("=======================");

		Rect rect = new Rect();
		drawShape(rect);

		System.out.println("=======================");

		Triangle triangle = new Triangle();
		drawShape(triangle);
		
		System.out.println("=======================");
		Circle circle = new Circle();
		drawShape(circle);
	}

	public static void drawPoint(Point pt) {
		pt.show();
	}

	public static void drawShape(Shape shape) {
		shape.draw();
	}
//	public static void drawRect(Rect rect) {
//		rect.draw();
//	}
//
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}

}
