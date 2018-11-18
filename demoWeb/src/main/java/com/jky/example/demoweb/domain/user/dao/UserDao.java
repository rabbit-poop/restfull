package com.jky.example.demoweb.domain.user.dao;

import java.util.List;

import com.jky.example.demoweb.domain.user.vo.UserVO;


public interface UserDao {
	public void insert(UserVO user);

	public List<UserVO> readAll();

	public void update(UserVO user);

	public void delete(String id);

	public UserVO read(String id);

}
