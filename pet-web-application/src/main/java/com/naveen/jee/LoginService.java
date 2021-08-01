package com.naveen.jee;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean isValidUser (String name, String password) {
		if (name.equals("naveen") && password.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}
}
