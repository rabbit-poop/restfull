package com.springboot.example.restfull.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.example.restfull.user.service.UserService;
import com.springboot.example.restfull.user.vo.UserVO;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@ResponseBody
	public Map getUserList() {
		Map<String,UserVO> userList = userService.getUserList();
		Map result = new HashMap();
		result.put("result", Boolean.TRUE);
		result.put("data", userList);
		return result;
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Map getUser(@PathVariable String id) {
		UserVO user = userService.getUser(id);
		Map result = new HashMap();
		result.put("result", Boolean.TRUE);
		result.put("data", user);
		return result;
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST, headers = { "Content-type=application/json" })
	@ResponseBody
	public Map insertUser(@RequestBody UserVO user) {
		if (user != null)
			userService.insertUser(user);
		Map result = new HashMap();
		result.put("result", Boolean.TRUE);
		return result;
	}

	@RequestMapping(value = "/users", method = RequestMethod.PUT, headers = { "Content-type=application/json" })
	@ResponseBody
	public Map updateUser(@RequestBody UserVO user) {
		if (user != null)
			userService.updateUser(user);
		Map result = new HashMap();
		result.put("result", Boolean.TRUE);
		return result;
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public Map deleteUser(@PathVariable String id) {
		userService.deleteUser(id);
		Map result = new HashMap();
		result.put("result", Boolean.TRUE);
		return result;
	}
}
