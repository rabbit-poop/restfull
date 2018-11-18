package com.springboot.example.restfull.user.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class TestController {
	@RequestMapping(value="/samplehome")
    @ResponseBody
    public String sampleHome() {
        
        return "Hello Gradle! Hello Spring Boot!";
        
    }
}
