package com.naveen.hotelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.naveen.hotelbooking.model.User;

public interface UsersRepository extends JpaRepository<User, String> {

	@Query("SELECT u FROM User u where u.userId = :userId and u.password= :password")
	User authenticateLogin(@Param("userId") String userId,@Param("password") String password);
	
	@Query("SELECT u FROM User u where u.userId = :userId")
	User getUserById(@Param("userId") String userId);
}
