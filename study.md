# SQLD

#### 간략 정리

- 테이블 속성 구조 변경
    - 오라클
        - ALTER TABLE 테이블명 MODIFY 컬럼명 타입;
            ex) ALTER TABLE emp MODIFY 컬럼명 VARCHAR2(4);(오라클에서는 VARCHAR2라고 씀)
    - SQL server 
        - ALTER TABLE 테이블명 ALTER COLUMN 컬럼명 타입;
        
- 테이블명 변경
    - 오라클
        - ALTER TABLE old_table RENAME new_table;
    - SQL server
        - RENAME TABLE old_table TO new_table;
    
- 칼럼 삭제

    - ALTER TABLE 테이블명 DROP COLUMN 칼럼명;
    
    
 - 테이블 삭제시 로그 남김 
    -  DELETE FROM 테이블명; 
        - (테이블의 데이터 모두 삭제, 디스크 사용량 초기화 X, ROLLBACK 가능)
 
 - 테이블 삭제시 로그 안남김
    - DROP TABLE 테이블명;
        - (테이블 데이터와 스키마 정의 삭제)
    - TRUNCATE TABLE 테이블명;
        - (특정 테이블의 모든데이터를 삭제하고 디스크 사용량을 초기화)
        
 
 - 저장점
    - 오라클
        - SAVEPOINT svpt1; 
        - ROLLBACK TO svpt1;
        
    - SQL server
        - SAVE TRANSACTION svtr1;
        - ROLLBACK TRANSACTION svtr1; 