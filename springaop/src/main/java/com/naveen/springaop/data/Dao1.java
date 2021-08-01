package com.naveen.springaop.data;

import org.springframework.stereotype.Repository;

import com.naveen.springaop.aspect.TrackTime;

@Repository
public class Dao1 {

	@TrackTime
	public String retrieveSomething() {
		return "Dao1";
	}
}
