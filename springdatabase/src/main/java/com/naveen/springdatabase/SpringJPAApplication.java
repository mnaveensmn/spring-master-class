package com.naveen.springdatabase;

import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.naveen.springdatabase.entity.Person;
import com.naveen.springdatabase.jpa.PersonJpaRepository;

//@SpringBootApplication
public class SpringJPAApplication implements CommandLineRunner {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJPAApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 10001 -> {}", repository.findById(10001));
		logger.info("Update -> {}",repository.update(new Person(10001,"Naveen","Tiruppur",new Date())));
		logger.info("Insert -> {}",repository.insert(new Person("Kumar","Tiruppur",new Date())));
		logger.info("Delete ");
		repository.deleteById(1);
		logger.info("Find All -> {}", repository.findAll());
	}
	
}
