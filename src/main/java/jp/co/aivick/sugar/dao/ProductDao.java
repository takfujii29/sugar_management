package jp.co.aivick.sugar.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import jp.co.aivick.sugar.entity.Product;

@ConfigAutowireable
@Dao
public interface ProductDao {
	
	@Select
	List<Product> findAll();
}
