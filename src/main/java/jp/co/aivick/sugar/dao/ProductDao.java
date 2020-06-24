package jp.co.aivick.sugar.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import jp.co.aivick.sugar.entity.Product;

@ConfigAutowireable
@Dao
public interface ProductDao {
	
	/**
	 * 全てのproductを返す
	 * @return List<Product>
	 */
	@Select
	List<Product> findAll();
	
	/**
	 * viewから渡されたidを使ってproductを返す
	 * @param selectedProductId
	 * @return Product
	 */
	@Select
	Product findBy(String selectedProductId);
}
