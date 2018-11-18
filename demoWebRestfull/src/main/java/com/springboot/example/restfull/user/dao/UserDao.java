package com.springboot.example.restfull.user.dao;

import java.util.List;
import java.util.Map;

import com.springboot.example.restfull.user.vo.UserVO;

public interface UserDao {
	public void insert(UserVO user);

	public Map<String,UserVO> readAll();

	public void update(UserVO user);

	public void delete(String id);

	public UserVO read(String id);
}
