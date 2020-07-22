package com.bit2020.chapter03.paint;

public class MainApp {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;

		Point point1 = new Point();
		point1.setX(x);
		point1.setY(y);

		Point point2 = new Point(50, 50);

//		drawPoint(point1);
		draw(point1);
//		drawPoint(point2);
		draw(point2);
		point1.show(false);

		System.out.println("=======================");

		Point point3 = new ColorPoint(); // 업캐스팅
		point3.setX(30);
		point3.setY(100);
		((ColorPoint) point3).setColor("red"); // 부모에서 자식접근할때는 명시적으로 해줘야함.

//		drawPoint(point3);
		draw(point3);
		
		Point point4 = new ColorPoint(10,20,"yellow");
		draw(point4);

		System.out.println("=======================");

		Rect rect = new Rect();
//		drawShape(rect);
		draw(rect);

		System.out.println("=======================");

		Triangle triangle = new Triangle();
//		drawShape(triangle);
		draw(triangle);

		System.out.println("=======================");
		Circle circle = new Circle();
//		drawShape(circle);
		draw(circle);
		

		System.out.println("//================================");

		draw(new GraphicText("Hello"));

		System.out.println("//============ instanceof 연산자1 ================");
		System.out.println(circle instanceof Circle);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Drawable);
		// 오류: 타입이 class 레퍼런스 변수인 경우
		// Hierachy 구조에서 상위, 하위 클래스만 instanceof 연산자를 사용 할 수 있다.
		// System.out.println(circle instanceof Rect);

		System.out.println("//============ instanceof 연산자2 ================");
		Shape s = new Circle();
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Triangle);
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Object);

		System.out.println("//============ instanceof 연산자3 ================");
		// Interface 구현 여부를 확인할 경우 Hierachy 구조 상관없이 instanceof 연산자를 사용할 수 있다.
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Runnable);
	}
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
//	public static void drawPoint(Point pt) {
//		pt.show();
//	}
//
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
//	public static void drawRect(Rect rect) {
//		rect.draw();
//	}
//
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}

}
