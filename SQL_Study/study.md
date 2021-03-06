# SQLD

#### 간략 정리
- 데이터 모델링
    - 정보시스템을 구축하기 위한 데이터 관점의 업무 분석 기법
    - 현실세계의 데이터(WHAT)에 대해 약속된 표기법에 의해 표현하는 과정
    - 데이터베이스를 구축하기 위한 분석/설계의 과정
    
- 데이터 모델링 유의점
    - 중복(Duplication)
        - 데이터 모델은 같은 데이터를 사용하는 사람, 시간, 그리고 장소를 파악하는데 도움을 줌으로써 데이터베이스가 여러 장소에 같은 정보를 저장하는 잘못을 하지 않도록 한다.
    - 비유연성(Inflexiblity)
        - 데이터 모델을 어떻게 설계했느냐에 따라 사소한 업무변화에도 데이터 모델이 수시로 변경됨으로써 유지보수의 어려움을 가중시킬 수 있다.
        - 데이터의 정의를 데이터의 사용 프로세스와 분리함으로써 데이터 모델링은 데이터 혹은 프로세스의 작은 변화가 애플리케이션과 데이터베이스에 중대한 변화를 일으킬 수 있는 가능성을 줄임.
    - 비일관성(Inconsistency)
        - 데이터의 중복이 없더라도 비일관성은 발생할 수 있음.
        - 데이터 모델릴을 할 때 데이터와 데이터 간의 상호 연관관계에 대해 명확하게 정의한다면 위험을 사전에 예방하는데 도움을 줄 수 있음.
        - 사용자가 처리하는 프로세스 혹은 이와 관련된 프로그램과 테이블의 연계성을 높이는 것은 데이터모델이 업무 변경에 대해 취약하게 만드는 단점에 해당.

- 개념적 데이터 모델링
    - 추상화 수준이 높고 업무중심적이고 포괄적인 수준의 모델링 진행, 전사적 데이터 모델링, EA수립시 많이 이용.   
 - 논리적 데이터 모델링
    - 데이터 모델링이 최종적으로 완료된 상태이고 물리적인 스키마 설계를 하기 전 단계
    - 시스템으로 구축하고자 하는 업무에 대해 KEY, 속성, 관계 등을 정확하게 표현, 재사용성이 높음
 - 물리적 데이터 모델링
    - 실제로 데이터베이스에 이식할 수 있도록 성능, 저장 등 물리적인 성격을 고려하여 설계
 
- 데이터베이스 스키마 구조 3단계
    - 외부스키마
    - 개념스키마
        - 모든 사용자 관점을 통합한 조직 전체 관점의 통합적 표현
        - 모든 응용시스템들이나 사용자들이 필요로 하는 데이터를 통합한 조직 전체의 DB를 기술한것으로 DB에 저장되는 데이터와 그들간의 관계를 표현하는 스키마
    - 내부스키마
    
     
- 트랜잭션의 4가지 특성
    - 원자성(Automicity)
        - 트랜잭션에서 정의된 연산들은 모두 성공적으로 실행되던지 아니면 전혀 실행되지 않은 상태로 남아 있어야 한다.(ALL OR NOTHING)
    - 일관성(Consistency)
        - 트랜잭션이 실행되기 전의 데이터베이스 내용이 잘못되어 있지 않다면 트랜잭션이 실행된 이후에도 데이터베이스의 내용에 잘못이 있으면 안된다.
    - 고립성(Isolaton)
        - 트랜잭션이 실행되는 도중에 다른 트랜잭션의 영향을 받아 잘못된 결과를 만들어서는 안된다.
    - 지속성(Durability)
        - 트랜잭션이 성공적으로 수행되면 그 트랜잭션이 갱신한 데이터베이스의 내용은 영구적으로 저장된다.
                
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
           
           SELECT(col1, col2*50, 50) FROM TABLE;
           - 첫번째행 COALESCE(100,100*50, 50)이고 첫번째 값이 100이므로 => 100
           - 두번째행 COALESCE(NULL,60 * 50, 50)이고 NULL이 아닌 값이 60*50이므로 => 3000
           - 세번째행 COALESCE(NULL,NULL * 50, 50)이니 첫번째, 두번째 NULL이니 세번째 값 => 50
        
 - WINDOW 함수는 다른 함수와는 달리 중첩해서 사용하지는 못하지만, 서브쿼리에서는 사용할 수 있다.
    - window 함수
        - 순위 : RANK, DENSE_RANK, ROW_NUMBER
        - 집계 : SUM, MAX, MIN, AVG, COUNT
        - FIRST_VALUE () OVER - 특정 그룹에서 특정 컬럼으로 정렬된 결과에서 첫번째 값을 구함.
        - LAST_VALUE () OVER - 마지막 값을 구함.
        
        ### 그룹내 순위함수
        - RANK : ORDER BY를 포함한 QUERY문에서 특정 항목에 대한 순위를 구하는 함수
            - 특정범위(partition) 내에서 순위를 구할 수도 있고 전체 데이터에 대한 순위를 구할수도 있다.
            - 동일 값에 대해서는 동일한 순위를 부여하고, 중간 순위를 비움
        - DENSE_RANK : 동일한 순위를 하나의 건수로 취급, 중간 순위를 비우지 않음
        - ROW_NUMBER : RANK나 DENSE_RANK 함수가 동일한 값에 대해서는 동일한 순위를 부여하는데 반해, 동일한 값이라도 고유한 순위를 부여함.
        
        ### 일반 집계 함수
        - SUM : 파티션별 윈도우의 합을 구할 수 있음.
        - MAX : 파티션별 최댓값을 구할 수 있음.
        - MIN : 파티션별 최솟값를 구할 수 있음.
        - AVG : 파티션별 평균을 구할 수 있음.
        - COUNT : 
        
        ### 그룹 내 행 순서 함수
        - FIRST_VALUE : 파티션별 윈도우에서 가장 먼저 나온 값을 구함.
            - SQL server에서는 지원하지 않음. MIN함수를 활용하여 같은 결과를 얻을 수 있음
        - LAST_VALUE : 파티션별 윈도우에서 가장 나중에 나온 값을 구함.
            - SQL server에서는 지원하지 않음. MAX함수를 활용하여 같은 결과를 얻을 수 있음
        - LAG : 파티션별 윈도우에서 이전 몇 번째 행의 값을 가져올 수 있음. SQL server에서는 지원하지 않음.
            - 3개의 ARGUMENTS 까지 사용할 수 있는데
            - 두번째 인자는 몇번째 앞의 행을 가져올지 결정하는 것이고(DEFAULT 1)
            - 세번째 인자는 예를 들어 파티션의 첫번째 행의 경우 가져올 데이터가 없어서 NULL 값이 들어오는데
              이 경우 다른 값으로 바꾸어 줄 수 있다. 결과적으로 NVL이나 ISNULL기능과 같다.
        - LEAD : 파티션별 윈도우에서 이후 몇번째 행의 값을 가져올 수 있음. SQL server에서는 지원하지 않음.
            - 3개의 ARGUMENTS 까지 사용할 수 있는데
            - 두번째 인자는 몇번째 후의 행을 가져올지 결정하는 것이고(DEFAULT 1)
            - 세번째 인자는 예를 들어 파티션의 마지막 행의 경우 가져올 데이터가 없어서 NULL 값이 들어오는데
              이 경우 다른 값으로 바꾸어 줄 수 있다. 결과적으로 NVL이나 ISNULL기능과 같다.
              
        ### 그룹 내 비율 함수 
        - RATIO_TO_REPORT : 파티션 내 전체 SUM(칼럼)값에 대한 행별 칼럼 값의 백분율을 소수점으로 구할 수 있음.
            - 결과 값은 > 0 & <= 1 의 범위를 가짐.
            - 그리고 개별 RATIO의 합을 구하면 1이 된다.
            - SQL server에서는 지원하지 않음
         - PERCENT_RANK : 파티션별 윈도우에서 제일 먼저 나오는 것을 0으로, 제일 늦게 나오는 것을 1로 하여 값이 아닌 행의 순서별 백분율을 구함.
            - 결과 값은 >= 0 & <= 1 의 범위를 가짐.
            - SQL server에서는 지원하지 않음
         - CUME_DIST : 파티션별 윈도우의 전체건수에서 현재 행보다 작거나 같은 건수에 대한 누적백분율을 구함.
            - 결과 값은 > 0 & <= 1 의 범위를 가짐.
            - SQL server에서는 지원하지 않음
         - NTILE : 파티션별 전체 건수를 ARGUMENT 값으로 N등분한 결과를 구할 수 있음.
       
     
        - !!! NVL은 window 함수가 아님.
 
 - 발생 시점에 따른 엔터티 분류
    - 기본 엔터티 : 원래 존재, 부모역할, 주식별자(사원, 조직, 상품 등)
    - 중심 엔터티 : 기본에서 발생, 행위엔터티 생성 (계약, 주문상품 등)
    - 행위 엔터티 : 2개의 부모엔터티에서 발생, 자주 바뀜 (주문목록, 계약진행, 주문내역 등)
    
 
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
  - FLOOR(3.8) => 3 # 숫자보다 작거나 같은 최대 정수를 리턴. 바닥으로 만든다. 소수점 아래를 무조건 무시
  - TRUNC(3.8) => 3 # 숫자를 소수 m자리에서 잘라서 리턴(m default 0). 소수점 제거, 시간, 날짜 제거
  - ROUND(3.8) => 4 # 숫자를 소수 m자리에서 반올림하여 리턴(m default 0). 반올림 함수
  - CEIL(3.8) => 4 # CEILING.숫자보다 크거나 같은 최소 정수를 리턴. 소수점 자리의 숫자를 무조건 올리는 함수
  
  
  출처 및 참고 문헌 : [SQL 자격검정 실전문제, 데이터 전문가포럼(네이버카페)]