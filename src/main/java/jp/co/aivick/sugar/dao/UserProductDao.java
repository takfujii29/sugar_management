package jp.co.aivick.sugar.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.boot.ConfigAutowireable;

import jp.co.aivick.sugar.entity.UserProduct;

@ConfigAutowireable
@Dao
public interface UserProductDao {
	
	@Insert
	int insert(UserProduct userProduct);
}
