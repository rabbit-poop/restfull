package com.jky.example.demoweb.domain.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class RestUserController {
	@RequestMapping(value ="/html/{id}",method = RequestMethod.GET)
	public String getByIdInHTML(@PathVariable String id, ModelMap model) {
		
		return "data";
	}
	
	

	
}
