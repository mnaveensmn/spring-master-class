package com.naveen.hotelbooking.service;

import java.sql.Date;
import java.util.List;

import com.naveen.hotelbooking.model.Booking;
import com.naveen.hotelbooking.model.Hotel;
import com.naveen.hotelbooking.model.User;

public interface HotelBookingService {
	
	List<Hotel> findAll();
	
	User authenticateLogin(String userId, String password);
	
	User getUserById(String userId);
	
	Hotel findHotelById(String hotelId);
	
	Booking saveBooking(Booking booking);
	
	List<Booking> getBookingByUser(User user);
	
	Long deleteBooking(Booking booking);
	
	List<Hotel> findHotelsByLocation (String location);
	
	Integer getOccupiedRoomCount(Date checkIn, Date checkOut, Hotel hotel);

}
