Select
	*
from
	library_mst
where
	순번 < 50
and 
	출판사 = '웨일북';
    
Select
	*
from
	library_mst
where
	도서명 like '%논문%'; # 나를% : 로시작, %나를 : 로 끝나는거, %나를% : 앞뒤로 상관없고 포함된것
    
Select
	*
from
	library_mst
where
	저작자 in('채사장 지음', '최인철 지음');
    /*저작자 like '%차사장%'
	or 저작자 like '%최인철%'*/