select
    UP.`*`,P.`*`,ROUND(SUM(P.sugar*UP.amount),1)AS totalsugar
from user_product UP
	INNER JOIN users U
	ON UP.user_id=U.user_id
	INNER JOIN products P
	ON UP.product_id=p.product_id
	AND UP.user_id= /*userId*/1 
	GROUP BY date