package com.naveen.hotelbooking.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.naveen.hotelbooking.model.Booking;
import com.naveen.hotelbooking.model.Hotel;
import com.naveen.hotelbooking.model.User;

public interface BookingRepository extends JpaRepository<Booking, Long>{
	
	@Query("SELECT sum(book.totalRooms) FROM Booking book where "
			+ "book.hotel= :hotel and ((book.checkIn< :checkIn and book.checkOut > :checkIn) or "
			+ "(book.checkIn < :checkOut and book.checkOut > :checkOut) or "
			+ "(book.checkIn> :checkIn and book.checkIn < :checkOut) or "
			+ "(book.checkOut> :checkIn and book.checkOut < :checkOut) or "
			+ "(book.checkIn= :checkIn and book.checkOut= :checkOut)) group by book.hotel")
	Integer getOccupiedRoomCountByHotel(@Param("checkIn") Date checkIn,@Param("checkOut") Date checkOut,@Param("hotel") Hotel hotel);
	
	@Query("SELECT book FROM Booking book where book.user= :user order by book.checkIn DESC")
	List<Booking> getBookingByUser(@Param("user") User user);
}