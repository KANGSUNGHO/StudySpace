package kr.ac.gachon.park;

public class TestParkSystem02 {

	public static void main(String[] args) {
		Car c1 = new Bus();
		ParkSystem02.park(c1);
		
		Car c2 = new SportsCar();
		ParkSystem02.park(c2);
		
		Car c3 = new Pocrain();
		ParkSystem02.park(c3);

	}

}
