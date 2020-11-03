package com.bit2020.chapter04.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			File file = new File("./src/main/java//com/bit2020/chapter04/io/phone.txt");
			if (!file.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}

			System.out.println("==============파일정보===============");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			long timestamp = file.lastModified();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String lastUpdate = sdf.format(timestamp);
			System.out.println(lastUpdate);

			System.out.println("==============전화번호===============");

			scanner = new Scanner(file);
			
			while(scanner.hasNextLine()) {
				String name = scanner.next(); // next()는 개행, 스페이스, 탭을 기준으로 잘라주기 때문에 next() 만 해주면 됨.
				String phone1 = scanner.next();
				String phone2 = scanner.next();
				String phone3 = scanner.next();
				
				System.out.println(name + ":" + phone1 + "-" + phone2 + "-" + phone3);
			}
		} catch (IOException e) {
			System.out.println("에러: " + e);
		} finally {
			scanner.close(); // scanner는 예외를 안시킴. 자체에 try catch를 처리하고 있음.
		}

	}

}
