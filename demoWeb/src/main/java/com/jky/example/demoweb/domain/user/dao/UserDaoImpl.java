package com.jky.example.demoweb.domain.user.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jky.example.demoweb.domain.user.vo.UserVO;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	static List<UserVO> userList  = new ArrayList() ;
	{
		userList.add(new UserVO("1","홍길동","남자","조선"));
		userList.add(new UserVO("2","김춘향","여자","남원"));
		userList.add(new UserVO("3","남포동","남자","울산"));
	}
	
	@Override
	public UserVO read(String id) {
		UserVO user  = new UserVO();
		user.testVO("2");
		return user;
	}

	public List<UserVO> readAll() {
		List<UserVO> userList = this.userList ;
		return userList;
	}
	
	public void insert(UserVO user) {
		//session.update("userNS.insertUser", user);
		this.userList.add(user);
		System.out.println("등록된 Record UserId=" + user.getUserId() + " Name=" + user.getName());
	}

	@Override
	public void update(UserVO user) {
		//session.update("userNS.updateUser", user);
		for(int i=0; i<this.userList.size(); i++) {
			UserVO userVO=this.userList.get(i);
			if(userVO.getUserId().equals(user.getUserId())){
				userVO.setCity(user.getCity());
				userVO.setGender(user.getGender());
				userVO.setName(user.getName());
			}
			
		}
		System.out.println("업데이트 Record UserId=" + user.getUserId() + " Name=" + user.getName());
		
	}

	@Override
	public void delete(String id) {
//		for(int i=0; i<this.userList.size(); i++) {
//			UserVO userVO=this.userList.get(i);
//			if(userVO.getUserId().equals(user.getUserId())){
//				this.userList.remove(i);
//			}
//			
//		}
		for( UserVO userVO : userList )
		 {
			if(userVO.getUserId().equals(id)){
				userList.remove(userVO);
			}
		 }

		System.out.println("삭제된 Record with ID = " + id +", size:"+ userList.size()); 
	}




	

}
