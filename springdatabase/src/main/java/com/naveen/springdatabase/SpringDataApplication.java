package com.naveen.springdatabase;

import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.naveen.springdatabase.entity.Person;
import com.naveen.springdatabase.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 10001 -> {}", repository.findById(10001));
		logger.info("Update -> {}",repository.save(new Person(10001,"Naveen","Tiruppur",new Date())));
		logger.info("Insert -> {}",repository.save(new Person("Kumar","Tiruppur",new Date())));
		logger.info("Delete ");
		repository.deleteById(1);
		logger.info("Find All -> {}", repository.findAll());	
	}
	
}
