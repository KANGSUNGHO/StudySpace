package practice02;

import java.util.Random;

public class Prob05 {
	public static void main(String[] args) {

		/* 코드를 작성합니다. */
		int minNumber = 1;
		int maxNumber = 100;

		Random random = new Random();
		int correctNumber = random.nextInt(maxNumber) + minNumber;

		System.out.println(correctNumber);

	}
}
