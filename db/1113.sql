/* 정렬 */

select
	*
from
	student_mst
order by
	mentor_id; #멘토의 오름차순으로 정렬
    
select
	*
from
	student_mst
order by
	mentor_id desc, #내림차순으로 정렬
    student_id desc; 
    
/* 전체 조합 실습 */
select
	count(*) as student_count,
    mentor_id 					#5
from
	student_mst 			    #1 테이블에 조건을 부여
where
	student_id > 2 				#2
group by
	mentor_id 					#3 
having
	student_count = 1 			#4 group by에서 묶은 결과에 having조건을 부여
order by 
	mentor_id desc;		  	    #6