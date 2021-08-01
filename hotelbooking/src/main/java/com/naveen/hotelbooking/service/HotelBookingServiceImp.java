package com.naveen.hotelbooking.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.hotelbooking.model.Booking;
import com.naveen.hotelbooking.model.Hotel;
import com.naveen.hotelbooking.model.User;
import com.naveen.hotelbooking.repository.BookingRepository;
import com.naveen.hotelbooking.repository.HotelRepository;
import com.naveen.hotelbooking.repository.UsersRepository;

@Service
public class HotelBookingServiceImp implements HotelBookingService {

	@Autowired
	HotelRepository hotelRepository;
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	UsersRepository userRepository;

	@Override
	public List<Hotel> findAll() {
		return hotelRepository.findAll();
	}

	@Override
	public Booking saveBooking(Booking booking) {
		bookingRepository.save(booking);
		return booking;
	}

	@Override
	public Integer getOccupiedRoomCount(Date checkIn, Date checkOut, Hotel hotel) {
		return bookingRepository.getOccupiedRoomCountByHotel(checkIn, checkOut, hotel);
	}

	@Override
	public List<Hotel> findHotelsByLocation(String location) {
		return hotelRepository.findHotelsByLocation(location);
	}

	@Override
	public Long deleteBooking(Booking booking) {
		bookingRepository.delete(booking);
		return booking.getId();
	}

	@Override
	public Hotel findHotelById(String hotelId) {
		return hotelRepository.findHotelById(hotelId);
	}

	@Override
	public User authenticateLogin(String userId, String password) {
		return userRepository.authenticateLogin(userId, password);
	}

	@Override
	public User getUserById(String userId) {
		return userRepository.getUserById(userId);
	}

	@Override
	public List<Booking> getBookingByUser(User user) {
		return bookingRepository.getBookingByUser(user);
	}
	
}
