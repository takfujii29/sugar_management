package jp.co.aivick.sugar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.aivick.sugar.dao.UserProductDao;
import jp.co.aivick.sugar.entity.UserProduct;

@Service
public class UserProductService {
	
	@Autowired
	private UserProductDao userProductDao;
	
	@Transactional
	public UserProduct create(UserProduct userProduct) {
		userProductDao.insert(userProduct);
		return userProduct;
	}
}
