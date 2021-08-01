package com.naveen.springaop;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.naveen.springaop.business.Business1;
import com.naveen.springaop.business.Business2;

@SpringBootApplication
public class SpringaopApplication implements CommandLineRunner{

	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Business1 business1;
	
	@Autowired
	Business2 business2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringaopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
	}

}
