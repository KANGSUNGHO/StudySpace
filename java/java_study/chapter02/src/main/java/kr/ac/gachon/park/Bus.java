package kr.ac.gachon.park;

public class Bus extends Car {
	@Override // @Override는 붙여줘도 되고 안붙여도 됨.
	public void park() {
		System.out.println("버스를 주차했습니다.");
	}
}
