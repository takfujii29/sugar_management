package jp.co.aivick.sugar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.aivick.sugar.dao.UserDao;
import jp.co.aivick.sugar.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public User findBy(String id) {
		return userDao.find(id);
	}
	
	public List<User> findAll() {
		return this.userDao.findAll();
	}
	
	@Transactional
	public User create(User user) {
		User newUser = new User();
		newUser.setLoginId(user.getLoginId());
		newUser.setName(user.getName());
		newUser.setPassword(passwordEncoder.encode(user.getPassword()));
		newUser.setEmail(user.getEmail());
		newUser.setRole(user.getRole());
		userDao.insert(newUser);
		return user;
	}
	
	@Transactional
	public User update(User user) {
		userDao.update(user);
		return user;
	}
}
