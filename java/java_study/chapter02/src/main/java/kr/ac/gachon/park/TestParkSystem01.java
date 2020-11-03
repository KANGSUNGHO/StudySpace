package kr.ac.gachon.park;

public class TestParkSystem01 {

	public static void main(String[] args) {
		Bus c1 = new Bus();
		ParkSystem01.park(c1);
		
		SportsCar c2 = new SportsCar();
		ParkSystem01.park(c2);

	}

}
