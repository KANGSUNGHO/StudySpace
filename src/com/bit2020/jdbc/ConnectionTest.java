package com.bit2020.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
	public static void main(String[] args) {
		Connection connection  = null;
		Statement stmt = null;
		try {
			// 1. JDBC Driver 로더(MariaDB Driver)
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 2. 연결하기
			String url = "jdbc:mysql://127.0.0.1:3306/webdb?characterEncoding=utf8";
			connection = DriverManager.getConnection(url,"webdb","webdb");
			
			System.out.println("연결성공");
			
			// 3. Statement 객체 생성
			stmt = connection.createStatement(); // sql 구문을 해주기 위해서 statement 생성
			
			// 4. SQL 실행
			String firstName = "강";
			String lastName = "성호";
			String email = "sungho1996@naver.com";
			
					
			String sql = "insert into emaillist values(null, '"+ firstName +"','"+ lastName +"','"+ email + "')"; // jdbc에는 sql에 세미콜론넣으면 안됨.
			int count = stmt.executeUpdate(sql); // 리턴값으로 인서트 개수가 나옴
			if(count == 1) {
				System.out.println("성공");
			}
			
					
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}	catch (SQLException e) {
				System.out.println("에러: " + e);
		} finally {
			try {
				if(connection != null) {
					connection.close();	
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch(SQLException e) {
				
			}
		}
		
	}
}
