select
    UP.`*`,P.`*`
from user_product UP
	INNER JOIN users U
	ON UP.user_id=U.user_id
	INNER JOIN products P
	ON UP.product_id=p.product_id