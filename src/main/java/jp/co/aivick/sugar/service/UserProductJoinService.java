package jp.co.aivick.sugar.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.aivick.sugar.dao.UserProductJoinDao;
import jp.co.aivick.sugar.entity.UserProductJoin;


@Service
public class UserProductJoinService {
	
	@Autowired
	private UserProductJoinDao userProductJoinDao;
	
	/**
	 * userIdが一致するデータを全て返す
	 * @param userId
	 * @return
	 */
	public List<UserProductJoin> findAllwhereUser(Integer userId) {
		return this.userProductJoinDao.findAllwhereUser(userId);
	}
	/**
	 * dateとuserIdが一致するproductをListで返す
	 * @param userId
	 * @param date
	 * @return
	 */
	public List<UserProductJoin> findAllwhereUserAndDate(Integer userId, Date date) {
		return this.userProductJoinDao.findAllwhereUserAndDate(userId, date);
	}
	public UserProductJoin findByDayTotal(Integer userId, Date date) {
		return this.userProductJoinDao.findByDayTotal(userId, date);
	}

}
