select
    UP.`*`,ROUND(SUM(P.sugar*UP.amount),1)AS totalsugar
from user_product UP
	INNER JOIN users U
	ON UP.user_id=U.user_id
	INNER JOIN products P
	ON UP.product_id=P.product_id
	where UP.user_id= /*userId*/1
	AND UP.date=/*date*/'2020-06-22'
	GROUP BY date