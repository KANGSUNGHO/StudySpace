package com.bit2020.chapter04.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
		// 기반 스트림(주 스트림) - 표준입력 시스템, stdin, System.in
		
		// 보조 스트림1- 기반 스트림에서 들어오는 byte|byte|byte -> char
		InputStreamReader isr = new InputStreamReader(System.in, "utf-8");
		
		// 보조 스트림2 - char|char|char|\n -> "charcharchar"
		br = new BufferedReader(isr);
		
		String line = null;
		while((line = br.readLine()) != null) {
			if("exit".equals(line)) {
				break;
			}
			System.out.println(line);
			
		}
		} catch(UnsupportedEncodingException e) { // 키보드 입력받을때 utf-8 형식이 잘못 기재되거나 없으면 에러 발
			System.out.println("에러: " + e);
		} catch(IOException e) {
			System.out.println("에러: " + e);
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch(IOException e) {
				System.out.println("에러: " + e);
			}
		}
	}

}
