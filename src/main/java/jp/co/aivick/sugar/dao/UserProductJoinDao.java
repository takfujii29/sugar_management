package jp.co.aivick.sugar.dao;

import java.sql.Date;
import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import jp.co.aivick.sugar.entity.UserProductJoin;

@ConfigAutowireable
@Dao
public interface UserProductJoinDao {
	 
	/**
	 * userIdが一致するデータを全て返す
	 * @param userId
	 * @return
	 */
	 @Select
	 List<UserProductJoin> findAllwhereUser(Integer userId);
	 
	 /**
	  *  dateとuserIdが一致するproductをListで返す
	  * @param userId
	  * @param date
	  * @return
	  */
	 @Select
	 List<UserProductJoin> findAllwhereUserAndDate(Integer userId, Date date);
	 
	 @Select
	UserProductJoin findByDayTotal(Integer userId, Date date);

}
