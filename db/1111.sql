/*
	DML
    C: insert (into) 데이터 추가
    R: select (from) 데이터 조회
	U: update (from) 데이터 수정
    D: delete (from) 데이터 삭제
*/


/*================<< insert >>=================*/
 
select * from student_mst;
/*데이터베이스명, 테이블명, `백커터`써줘야함*/
insert into /* student_mst valuser(4, '손지호' null); 이렇게 쓰면 컬럼의 개수만큼 null을 다 써줘야한다.*/
	`db_study2_explain`.`student_mst` 
    (`student_id`, `student_name`) /* 위의 테이블에서 이(컬럼) 두개만 넣고 나머지는 null을 넣겠다.*/
values (4, '손지호');

insert into `student_mst`
	(`student_id`, 	`student_name`, 	`mentor_id`)
values
	(5,				 '이강용',			 10),
	(6,				 '김준경', 			 10),
	(7,				 '이현수', 			 10),
	(8, 			 '정의현', 			 10); /* insert 는 최소한으로 해주는 것이 좋다*/

insert into 
	`db_study2_explain`.`university_mst`
	(`university_id`, 	`university_name`)
values
	(4,					  '신라대'),
	(5,					  '부경대'),
	(6,					  '동의대'),
	(7,					  '동아대'),
	(8,					  '인제대'),
	(9,					  '고려대'),
	(10,				  '연세대'),
	(11,				  '한양대'),
	(12,				  '용인대');
select * from `db_study2_explain`.`university_mst`;

/*================<< update >>=================*/

update 
	`db_study2_explain`.`student_mst`
set
	`student_name` = '강재영',
	`mentor_id` = 15
where
	`student_id` = 5;  /* id가 5번인사람의 멘토id를 15로 바꿔라*/
    
/* 멘토 id가 10인 학생들의 멘토 아이디를 1로 바꿔라 */

update
	`db_study2_explain`.`student_mst`
set /*셋에서 쓰면 = 은 대입*/
	`mentor_id` = 1
where /*웨얼에서 쓰면 = 은 비교 */
	`mentor_id` = 10;

select * from `db_study2_explain`.`student_mst`;

/*================<< delete >>=================*/
delete /*아무것도 적지 않는다.*/ 
from 
	`db_study2_explain`.`student_mst` 
where /*조건, 키값필수*/ 
	`student_id` = 4
    /*`student_id` > 5 이렇게 쓸수도 있다.*/
and `student_name` = '손지호';

select * from `db_study2_explain`.`student_mst`;

delete
from
	`db_study2_explain`.`university_mst` /*여기까지만 적고 실행하면 전체 삭제 된다.*/
where
	`university_id` = 1;
    
select * from `db_study2_explain`.`university_mst`;

/*================<< select >>=================*/
/*다음쿼리로*/ 


