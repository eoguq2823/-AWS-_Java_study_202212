select
	*
from
	library_mst;		
select
	*
from
	library_mst;
/* 저작자옆에 저작자명,  출판사옆에 출판사명 붙이기 */
select 
	순번,
	도서관명,
	구분,
	도서명,
	저작자,
	(select author_name from author_mst where author_id = 저작자) as 저작자명, #하나의 결과가지고만 서브쿼리 사용 where author_id < 저작자 사용X
	출판사,
	(select publisher_name from publisher_mst where publisher_id = 출판사) as 출판사명, 
	(select publisher_year from publisher_mst where publisher_id = 출판사) as 출판사설립일, 
	발행연도,
	청구기호
from
	library_mst;
					
/* =================<<조인>>================= */

insert into library_mst #데이터 추가
values (0, '테스트도서관', '999(테스트)', '테스트도서명', '9999', '9999', '2023', '999.9-테99=');
#가장 기본적은 join (모든 경우의 수 결과가 출력)
select 
	*
from
	library_mst lm, #얘를 기준으로 모든게 다 붙는다. (마스터테이블)
	author_mst am;

#인어 조인 : 조합 교집합 안
#아웃터 조인 : 조합 교집합 밖
# inner join (양쪽다 있는것만 가져온다)
set profiling = 1;
set profiling_history_size = 30; /* 시간 확인 */ 
select 
	*
from
	library_mst lm #이너레프트이런게 들어오면 쉼표 X	
    inner join publisher_mst pm	on/*조건*/(pm.publisher_id = lm.출판사)
order by
	lm.순번 desc;
    
select 
	*
from
	library_mst lm	
    left outer join publisher_mst pm on/*조건*/(pm.publisher_id = lm.출판사)
order by
	lm.순번 desc;

select 
	*
from
	library_mst lm	
    left outer join publisher_mst pm on/*조건*/(pm.publisher_id = lm.출판사)
where
	pm.publisher_id is null
order by
	lm.순번 desc; 
    
select 
	lm.순번,
	lm.도서관명,
	lm.구분,
	lm.도서명,
	lm.출판사,
	pm.publisher_name,
	pm.publisher_year
from
	library_mst lm	
    left outer join publisher_mst pm on/*조건*/(pm.publisher_id = lm.출판사)
where
	pm.publisher_id is null
order by
	lm.순번 desc;
    
show profiles;