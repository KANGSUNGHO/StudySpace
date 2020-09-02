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
 
 - 결과가 NULL이 나오는 경우
    - (1) SELECT CASE 'AB' WHEN 'BC' THEN 'CD' END FROM DUAL;
        - ex) CASE 'A' WHEN 'B' THEN 'C' ELSE 'D' END
             <br> 만약에 A가 B라면 C를 출력하고 아니면 D를 출력하라. 여기서 ELSE 'D'는 생략 가능하고 생략한다면 NULL로 처리함.
    - (2) SELECT DECODE ('AB', 'CD', 'DE') FROM DUAL;
        - ex) DECODE('A','B','C','D')
             <br> 만약에 A가 B라면 C를 출력하고 아니면 D를 출력하라. 여기서 'D'는 생략가능하고 생략한다면 NULL로 처리함.
             
    - (3) SELECT NULLIF('AB','AB') FROM DUAL;
        - ex) NULLIF('A','B')
             <br> 'A'가 'B'랑 같으면 NULL을 출력함.
 - 결과가 NULL이 안나오는 경우
    - (1) SELECT COALESCE('AB','BC','CD') FROM DUAL;
        - COALESCE는 괄호안의 값중 첫번째로 NULL이 아닌 값을 출력한다.
        - COALESCE 예시
           |col1|col2|
           |----|----|
           |100|100|
           |NULL|60|
           |NULL|NULL|
           <br> SELECT(col1, col2*50, 50) FROM TABLE;
           - 첫번째행 COALESCE(100,100*50, 50)이고 첫번째 값이 100이므로 => 100
           - 두번째행 COALESCE(NULL,60 * 50, 50)이고 NULL이 아닌 값이 60*50이므로 => 3000
           - 세번째행 COALESCE(NULL,NULL * 50, 50)이니 첫번째, 두번째 NULL이니 세번째 값 => 50
        
 - WINDOW 함수는 다른 함수와는 달리 중첩해서 사용하지는 못하지만, 서브쿼리에서는 사용할 수 있다.
    - window 함수
        - 순위 : RANK, DENSE_RANK, ROW_NUMBER
        - 집계 : SUM, MAX, MIN, AVG, COUNT
        - FIRST_VALUE () OVER - 특정 그룹에서 특정 컬럼으로 정렬된 결과에서 첫번째 값을 구함.
        - LAST_VALUE () OVER - 마지막 값을 구함.
        
        - !!! NVL은 window 함수가 아님.
 
 - 발생 시점에 따른 엔터티 분류
    - 기본 엔터티 : 원래 존재, 부모역할, 주식별자(사원, 조직, 상품 등)
    - 중심 엔터티 : 기본에서 발생, 행위엔터티 생성 (계약, 주문상품 등)
    - 행위 엔터티 : 2개의 부모엔터티에서 발생, 자주 바뀜 (주문목록, 계약진행, 주문내역 등)
    
 - 논리적 모델링 : 데이터 모델링이 최종적으로 완료된 상태이고 물리적인 스키마 설계를 하기 전 단계  
 
 - N개 테이블 조인시 조인 최소 조건은 N-1개 
 
 - 주식별자 : 대표성 있고, 참조관계 연결 가능
 - 보조식별자 : 대표성 없고 참조관계 연결 불가능
 
 - 분산 데이터베이스
     - 특징
        - 분할투명성 : 분할되서 여러 곳에 저장
        - 위치투명성 : 데이터의 저장 장소 명시가 불필요
        - 지역사상투명성 : 지역 DBMS와 물리적 DB 사이 mapping 보장
        - 중복투명성 : 여러 site 중복 무관
        - 장애투명성 : 장애 발생해도 무관
        - 병행 투명성 : 다수 트랜잭션 동시에 실행해도 결과 일관성
        
  - Row Chaining : 로우 길이가 너무 길어서 데이터 블록 하나에 데이터가 모두 저장되지 않고, 두개 이상의 블록에 걸쳐 하나의 로우가 저장되는 현상
  - Row Migration : UPDATE로 인해 행 길이가 증가했을때 저장 공간이 부족한 경우 발생, 다른 블록 빈 공간에 저장
  
  - 다른 유형간 비교시 둘 중 우선순위가 높은쪽으로 데이터 타입을 변환하여 비교함. 문자보다 숫자가 우선순위가 높으므로 숫자와 문자가 만나면 문자를 숫자로 변환함.
  
  - UNIQUE INDEX SCAN(유일 인덱스 스캔)
    - 단 하나의 값을 추출하는 방식
    - 유일인덱스 구성 컬럼에 모두 = 값이 주어지면 결과는 1건이 되어서 모두 = 인 경우에만 사용이 가능함.
    - 유일 인덱스 구성 컬럼은 PK임
       <br> WHERE key1 = 1 AND key2 = 2, WHERE(key1,key2) IN ((1,2))는 가능하지만, WHERE key=1 처럼 한개의 키에만 조건을 주면 1개 이상의 값이 나올 수 있다.
       
  - 외래키 값은 NULL이거나 부모키 값과 동일해야함(참조 무결성 제약조건)
  
  - CROSS JOIN과 NATURAL JOIN
    - CROSS JOIN
        - JOIN에 참여하는 테이블의 JOIN key가 없을 경우 발생
        - A와 B가 조인할때 A의 모든행과 B의 모든 행이 조인되는 것
        - 카타시안 곱과 비슷
        - 나올 수 있는 모든 경우의 행이 나옴.
        - WHERE 절에서 조건을 걸 수 있다.
    - NATURAL JOIN
        - 두 테이블이 같은 이름의 열이 있을때 두 열이 일치하는 행을 반환
        - 특정 JOIN 컬럼을 명시할 수 없음.
        - JOIN key는 컬럼명으로 결정됨.
        - WHERE에 조건을 걸 수 없음.
        - ex) SELECT col FROM table1 NATURAL JOIN table2;  
        == SELECT col FROM table1 INNER JOIN table2 ON table1.col = table2.col;
        
  - ABS(-3.8) => 3.8 # 절대값. 음수값 양수로 출력
  - FLOOR(3.8) => 3 # 바닥으로 만든다. 소수점 아래를 무조건 무시
  - TRUNC(3.8) => 3 # 소수점 제거, 시간, 날짜 제거
  - ROUND(3.8) => 4 # 반올림 함수ss
  - CEIL(3.8) => 4 # 소수점 자리의 숫자를 무조건 올리는 함수     