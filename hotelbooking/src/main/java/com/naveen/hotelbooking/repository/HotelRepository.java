package com.naveen.hotelbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.naveen.hotelbooking.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {

	@Query("SELECT h FROM Hotel h where h.location = :location")
	List<Hotel> findHotelsByLocation(@Param("location") String location);
	
	@Query("SELECT h FROM Hotel h where h.hotelId = :hotelId")
	Hotel findHotelById(@Param("hotelId") String hotelId);
	
}
