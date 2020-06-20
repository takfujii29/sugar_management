package jp.co.aivick.sugar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.aivick.sugar.dao.UserProductJoinDao;
import jp.co.aivick.sugar.entity.UserProductJoin;


@Service
public class UserProductJoinService {
	
	@Autowired
	private UserProductJoinDao userProductJoinDao;
	
	public List<UserProductJoin> findAllwhereUser(Integer userId) {
		return this.userProductJoinDao.findAllwhereUser(userId);
	}

}
