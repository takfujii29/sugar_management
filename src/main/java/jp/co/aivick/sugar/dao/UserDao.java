package jp.co.aivick.sugar.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import jp.co.aivick.sugar.entity.User;

@ConfigAutowireable
@Dao
public interface UserDao {
	
	@Select
	User find(String id);
	
	@Select
	List<User> findAll();
	
	@Insert
	int insert(User user);
	
	@Update
	int update(User user);
	
}
