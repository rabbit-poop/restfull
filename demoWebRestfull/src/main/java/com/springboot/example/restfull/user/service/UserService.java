package com.springboot.example.restfull.user.service;

import java.util.List;
import java.util.Map;

import com.springboot.example.restfull.user.vo.UserVO;


public interface UserService {
	public void insertUser(UserVO user);

	public Map<String,UserVO> getUserList();

	public void deleteUser(String id);

	public UserVO getUser(String id);

	public void updateUser(UserVO user);
}
