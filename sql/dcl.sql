-- 1. DB 생성
create database webdb;
	-- drop database webdb;
-- 2. DB user 생성 
	-- drop user 'webdb'@'localhost'
create user 'webdb'@'localhost' identified by 'webdb';

-- 3. grant privileges - webdb 라는 사용자에게 webdb의 권한을 줌
grant all privileges on webdb.* to 'webdb'@'localhost'; 
