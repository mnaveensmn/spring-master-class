package com.naveen.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.springaop.data.Dao1;

@Service
public class Business1 {

	@Autowired
	private Dao1 dao1;
	
	public String calculateSomething() {
		return dao1.retrieveSomething();
	}
}
