package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		
		/* 코드를 작성합니다. */
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하세요( 0입력시 종료): ");
			int a = scanner.nextInt();
			int sum = 0;
			if(a == 0) {
				scanner.close();
				break;
			}
			for(int i = 1; i <= a; i++) {
				if(a != 0 && a % 2 == 0) {
					if (i %2 == 0 ) {
						sum += i;
					}
					else
						continue;
				}
				else{
					if(i % 2 != 0) {
						sum += i;
					}
					else
						continue;
					}
				}
			System.out.printf("결과 값: %d",sum);
			System.out.println();
			}
	}
}
