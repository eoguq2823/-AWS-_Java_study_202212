/*================<< select >>=================*/

select * from `student_mst`;
/* 전체 컬럼 조회 */
select
	*
from
	`student_mst`;

/* 지정 컬럼 조회 */    
select
	`student_id`,
	`student_name`
from
	`student_mst`;

# 임시 컬럼 추가 
SELECT 
	1 as num,
    '김준일' as name;
    
SELECT 
	student_id,
    student_name,
    '김준일' as instructor_name
from 
	student_mst;

# 컬럼명을 임시로 바꾸는 방법 as = 알리아스(alias) 컬럼에서는 생략X 데이블에서는 보통 생략 student_mst as sm;
select 
	sm.student_id as sutdentId  #카멜표기법으로 변수명으로 사용가능
from
	student_mst /*as*/ sm;
    
# 조회 조건 where
select 
	*
from
	student_mst 
where
	mentor_id = 1; #1번멘토의 학생들을 불러와라
# ======================================================
# select문의 실행 순서 from(컬럼) 1순서 where(조건)이 2순서 select(테이블)이 3순서 
select 
	*
from
	student_mst 
where
	mentor_id = (SELECT  #성능이랑 직결되기때문에 2번이상쓸경우 타당한 이유가 있어야한다.
					mentor_id
				FROM
					mentor_mst
				WHERE
					mentor_name = '문자영');
                    
# =======================멘토들의 이름 같이 출력=========================
SELECT
	student_id,
    student_name,
    mentor_id,
    (select 
		mentor_name 
	from
		mentor_mst 
    where 
		mentor_id = student_mst.mentor_id) as mentor_name
FROM
	student_mst;
    
/* 그룹으로 묶어서 조회하기 */

select
	mentor_id,
	count(mentor_id), #멘토의 중복된수
    min(student_id), #그룹으로 묶인 녀석들 안에서 제일작은거
    max(student_id), #최대
    avg(student_id), #평균
    sum(student_id)  #합
from
	student_mst
group by
	mentor_id; #멘토의 id가 같은 것들끼리 묶겟다.
    
    
/* 그룹으로 조회한 결과에 조건주는 방법*/

select
	mentor_id,
	count(mentor_id) as mentor_count, #멘토의 중복된수
    min(student_id) as student_min, #그룹으로 묶인 녀석들 안에서 제일작은거
    max(student_id), #최대
    avg(student_id), #평균
    sum(student_id)  #합
from
	student_mst
group by
	mentor_id #멘토의 id가 같은 것들끼리 묶겟다.
having
	mentor_count = 5;

/* 중복 제거*/
select distinct
	mentor_id 
from
	student_mst; #* 일시 3개의 조합이 중복제거, mentor_id시 멘토중복제거
	
