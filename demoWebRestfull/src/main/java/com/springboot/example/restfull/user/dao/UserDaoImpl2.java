package com.springboot.example.restfull.user.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springboot.example.restfull.user.vo.UserVO;

@Repository("userDao")
public class UserDaoImpl2 implements UserDao {


	static Map<String,UserVO> userMap  = new HashMap<String,UserVO>() ;
	{
		UserVO userVO = new UserVO("1","ȫ�浿1","����","����");
		userMap.put(userVO.getUserId(),userVO);
		userVO = new UserVO("2","������1","����","����");
		userMap.put(userVO.getUserId(),userVO);
		userVO = new UserVO("3","������1","����","���");
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
		System.out.println("��ϵ� Record UserId=" + user.getUserId() + " Name=" + user.getName());
	}

	@Override
	public void update(UserVO user) {
		this.userMap.put(user.getUserId(), user);
		System.out.println("������Ʈ Record UserId=" + user.getUserId() + " Name=" + user.getName());
		
	}

	@Override
	public void delete(String id) {
		this.userMap.remove(id);

		System.out.println("������ Record with ID = " + id +", size:"+ userMap.size()); 
	}
}
