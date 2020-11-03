package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		/* 코드를 작성합니다. */
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String word = scanner.nextLine(); // next()는 문자 또는 문자열을 공백을 기준으로 한 단어 또는 한 문자씩 입력 받
										  // nextLine()는 문자 또는 문장 한 라인 전체를 입력받음.
		String word2 = new String();
		char[] array_word = new char[word.length()];
		
		for(int i = 0; i < array_word.length; i++) {
			array_word[i] = (word.charAt(i));
			word2 += array_word[i];
			System.out.println(word2);
		}
	}
}