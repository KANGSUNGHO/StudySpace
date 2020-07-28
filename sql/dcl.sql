-- 1. DB 생성
create database webdb;
	-- drop database webdb; // 데이터베이스 삭제 
	
-- 2. DB user 생성 
	-- drop user 'webdb'@'localhost' // user 삭제 
create user 'webdb'@'localhost' identified by 'webdb';

-- 3. grant privileges - webdb 라는 사용자에게 webdb의 권한을 줌
grant all privileges on webdb.* to 'webdb'@'localhost'; 
