package com.bit2020.chapter03.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileTest {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("./hello.txt");
			int data = is.read();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.:" + e);
		} catch (IOException e) {
			System.out.println("에러: " + e);
		} finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
