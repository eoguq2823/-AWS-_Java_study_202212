

insert into customer_mst values (1, '강대협', '부산 동래구 사직동'); 
insert into customer_mst values (2, '김준일', '부산 부산진구 가야동'); 
insert into customer_mst values (3, '손민재', '부산 남구 대연동'); 

SELECT * FROM db_study.customer_mst;

insert into product_mst values (1, '아이폰13', '10000000');
insert into product_mst values (2, '아이폰14', '11000000');
insert into product_mst values (3, '아이폰15', '12000000');

select * from product_mst;

insert into order_mst values (1, 23011901, 1);
insert into order_mst values (2, 23011902, 2);
insert into order_mst values (2, 23011902, 3);
insert into order_mst values (4, 23011904, 1);

select * from order_mst;

select 
	*
from
	order_mst om
    left outer join order_dtl od on(od.order_id = om.order_id)
    left outer join product_mst pm on(pm.product_id = od.product_id)
    left outer join customer_mst cm on(cm.customer_id = om.customer_id);  