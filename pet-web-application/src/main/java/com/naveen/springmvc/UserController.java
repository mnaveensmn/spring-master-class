package com.naveen.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping(value ="/user")
	public String sayHello() {
		return "user";
	}
}
