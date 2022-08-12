package com.javainuse.controller;

import com.javainuse.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin()
public class HelloWorldController {
	@Autowired
	JwtUserDetailsService jUserDetailsService;
	@RequestMapping({ "/hello" })
	public String hello() {
		return "Hello World";
	}

	@RequestMapping({ "/getall" })
	public List<Integer> getall() {
		return jUserDetailsService.getList();
	}

}
