package com.bit2020.chapter04.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		 // 기반 스트림 (주 스트림)
		try {
			FileReader fr = new FileReader("./src/main/java/com/bit2020/chapter04/io/BufferedReaderTest.java");
			
			// 보조 스트림
			br = new BufferedReader(fr);
			
			String line = null;
			int index = 0;
			while((line = br.readLine()) != null){
				index++;
				System.out.print(index);
				System.out.print(": ");
				System.out.print(line);
				System.out.print("\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.: " + e);
		}catch(IOException e) {
			System.out.println("에러: " +e);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
