package com.bit2020.guestbook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bit2020.guestbook.vo.GuestbookVo;


public class GuestbookDao {
	public boolean insert(GuestbookVo vo) {

		boolean result = false;
		Connection connection = null;
		PreparedStatement pstmt = null;
		try {
			// 1. JDBC Driver 로더(MariaDB Driver)
			Class.forName("org.mariadb.jdbc.Driver");

			// 2. 연결하기
			String url = "jdbc:mysql://127.0.0.1:3306/webdb?characterEncoding=utf8";
			connection = DriverManager.getConnection(url, "webdb", "webdb"); //(url,dbname, dbpassword)

			System.out.println("연결성공");
			
			// 3. SQL 준비 
			String sql = "insert into guestbook value(null,?,?,now(),?)";
			pstmt = connection.prepareStatement(sql);
			
			// 4. 바인딩(binding)
			pstmt.setString(1,vo.getName());
			pstmt.setString(2,vo.getPassword());
			pstmt.setString(3,vo.getMessage());
			
			// 5. SQL 실행 
			int count = pstmt.executeUpdate(); // 리턴값으로 인서트 개수가 나옴
			result = (count == 1);


		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러: " + e);
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public List<GuestbookVo> findAll() {
		List<GuestbookVo> result = new ArrayList<>();
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1. JDBC Driver(MariaDB Driver)
			Class.forName("org.mariadb.jdbc.Driver");

			// 2. 연결하기
			String url = "jdbc:mysql://127.0.0.1:3306/webdb?characterEncoding=utf8";
			connection = DriverManager.getConnection(url, "webdb", "webdb");

			// 3. Statement 객체 생성
			stmt = connection.createStatement();

			// 4. SQL 실행
			String sql = "select no, name, date_format(reg_date, '%Y-%m-%d %h:%i:%s'), message from guestbook order by reg_date desc";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Long no = rs.getLong(1);
				String name = rs.getString(2);
				String regDate = rs.getString(3);
				String message = rs.getString(4);

				GuestbookVo vo = new GuestbookVo();
				vo.setNo(no);
				vo.setName(name);
				vo.setRegDate(regDate);
				vo.setMessage(message);

				result.add(vo);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러:" + e);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
}
