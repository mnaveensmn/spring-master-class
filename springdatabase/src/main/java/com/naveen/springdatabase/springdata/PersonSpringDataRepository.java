package com.naveen.springdatabase.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.springdatabase.entity.Person;

public interface PersonSpringDataRepository 
				extends JpaRepository<Person, Integer> {

}
