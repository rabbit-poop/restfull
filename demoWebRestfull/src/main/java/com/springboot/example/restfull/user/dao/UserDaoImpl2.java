package com.springboot.example.restfull.user.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springboot.example.restfull.user.vo.UserVO;

@Repository("userDao")
public class UserDaoImpl2 implements UserDao {


	static Map<String,UserVO> userMap  = new HashMap<String,UserVO>() ;
	{
		UserVO userVO = new UserVO("1","홍길동1","남자","조선");
		userMap.put(userVO.getUserId(),userVO);
		userVO = new UserVO("2","김춘향1","여자","남원");
		userMap.put(userVO.getUserId(),userVO);
		userVO = new UserVO("3","남포동1","남자","울산");
		userMap.put(userVO.getUserId(),userVO);
	}
	
	@Override
	public UserVO read(String id) {
		UserVO user  = userMap.get(id);
		return user;
	}

	public Map<String,UserVO>  readAll() {
		Map<String,UserVO>  userList = this.userMap ;
		return userList;
	}
	
	public void insert(UserVO user) {
		this.userMap.put(user.getUserId(), user);
		System.out.println("등록된 Record UserId=" + user.getUserId() + " Name=" + user.getName());
	}

	@Override
	public void update(UserVO user) {
		this.userMap.put(user.getUserId(), user);
		System.out.println("업데이트 Record UserId=" + user.getUserId() + " Name=" + user.getName());
		
	}

	@Override
	public void delete(String id) {
		this.userMap.remove(id);

		System.out.println("삭제된 Record with ID = " + id +", size:"+ userMap.size()); 
	}
}
