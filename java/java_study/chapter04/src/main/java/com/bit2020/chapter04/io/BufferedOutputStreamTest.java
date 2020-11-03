package com.bit2020.chapter04.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		
		try {
			FileOutputStream fis = new FileOutputStream("test.txt");
			bos = new BufferedOutputStream(fis);
			for(int i = 'a'; i <= 'z'; i++) { // == for(int i = 97; i <= 122; i++)
				bos.write(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 열 수 없습니다: " + e);
		} catch (IOException e) {
			System.out.println("에러: " + e);
		} finally {
			try {
				if(bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				System.out.println("에러: " + e);
			}
		}
	}
}
