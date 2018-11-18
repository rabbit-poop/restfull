package com.springboot.example.restfull.user.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.example.restfull.user.dao.UserDao;
import com.springboot.example.restfull.user.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public void insertUser(UserVO user) {
		userDao.insert(user);
	}

	public Map<String,UserVO> getUserList() {
		return userDao.readAll();
	}

	@Override
	public void deleteUser(String id) {
		userDao.delete(id);
		
	}

	@Override
	public UserVO getUser(String id) {
		return userDao.read(id);
	}

	@Override
	public void updateUser(UserVO user) {
		userDao.update(user);
		
	}

}
