package practice01;

public class Prob02 {

	public static void main(String[] args) {
		/* 코드를 작성합니다. */
		while(true) {
			for(int i =1; i < 10; i++) {
				for(int j = i; j < 10+i; j++) {
				System.out.printf("%d ",j);
				}
				System.out.println();
			}
			break;
		}
	}
}