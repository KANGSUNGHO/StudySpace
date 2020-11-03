package practice02;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		/* 코드를 작성합니다. */
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액: ");
		int money = scanner.nextInt();
		int sum = 0;
		int count = 0;
		while (true) {
			if (money > 50000) {
				count = money / 50000;
				money = money - (50000*count);
				System.out.printf("50000원 : %d개", count);
				System.out.println(money);
				System.out.println();
				count = 0;
			} else if (money > 10000) {
				count = money / 10000;
				money = money - (10000*count);
				System.out.printf("10000원 : %d개", count);
				System.out.println();
				count = 0;
			} else if (money > 5000) {
				count = money / 5000;
				money = money - (5000*count);
				System.out.printf("5000원 : %d개", count);
				System.out.println();
				count = 0;
			} else if (money > 1000) {
				count = money / 1000;
				money = money - (1000*count);
				System.out.printf("1000원 : %d개", count);
				System.out.println();
				count = 0;
			} else if (money > 500) {
				count = money / 500;
				money = money - (500*count);
				System.out.printf("500원 : %d개", count);
				System.out.println();
				count = 0;
			} else if (money > 100) {
				count = money / 100;
				money = money - (100*count);
				System.out.printf("100원 : %d개", count);
				System.out.println();
				count = 0;
			} else if (money > 50) {
				count = money / 50;
				money = money - (50*count);
				System.out.printf("50원 : %d개", count);
				System.out.println();
				count = 0;
			} else if (money > 10) {
				count = money / 10;
				money = money - (10*count);
				System.out.printf("10원 : %d개", count);
				System.out.println();
				count = 0;
			} else if (money > 5) {
				count = money / 5;
				money = money - (5*count);
				System.out.printf("5원 : %d개", count);
				System.out.println();
				count = 0;
			} else {
				System.out.printf("1원 : %d개", money);
				System.out.println();
				break;
			}
		}

	}
}
