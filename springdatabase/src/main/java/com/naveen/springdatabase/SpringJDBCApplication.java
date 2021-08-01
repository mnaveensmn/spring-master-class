package com.naveen.springdatabase;

import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.naveen.springdatabase.entity.Person;
import com.naveen.springdatabase.jdbc.PersonJdbcDAO;

//@SpringBootApplication
public class SpringJDBCApplication implements CommandLineRunner {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDAO dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJDBCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All user -> {}",dao.findAll());
		logger.info("User id 10001 -> {}", dao.findById(10001));
		logger.info("User name Pieter -> {}", dao.findByName("Pieter"));
		logger.info("Delete Pieter -> {}", dao.deleteById(10001));
		
		logger.info("Delete Pieter and New York-> {}", 
				dao.deleteByNameLocation("Pieter","New York"));
		
		logger.info("Inserting 10005 -> {}", 
				dao.insert(new Person(10005,"Naveen","SKP",new Date())));
		
		logger.info("Updating 10003 -> {}", 
				dao.update(new Person(10003,"Naveen Kumar","Chennai",new Date())));
		
	}
	
}
