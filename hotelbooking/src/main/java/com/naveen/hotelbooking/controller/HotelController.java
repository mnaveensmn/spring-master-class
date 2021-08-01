package com.naveen.hotelbooking.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.hotelbooking.model.Booking;
import com.naveen.hotelbooking.model.Hotel;
import com.naveen.hotelbooking.model.User;
import com.naveen.hotelbooking.service.HotelBookingService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class HotelController {

	@Autowired
	HotelBookingService hotelBookingService;
	
	@GetMapping("/authenticate")
	public ResponseEntity<User> authenticateLogin(@RequestParam(name="userid",defaultValue="") String userId,
			@RequestParam(name="password",defaultValue="") String password){
		User foundUser = hotelBookingService.authenticateLogin(userId, decriptString(password));
		return new ResponseEntity<User>(foundUser, HttpStatus.OK);
	}
	
	@GetMapping("/getusername")
	public ResponseEntity<String> getUserName(@RequestParam(name="userid",defaultValue="") String userId){
		User user = hotelBookingService.getUserById(userId);
		return new ResponseEntity<String>(user.getName(), HttpStatus.OK);
	} 
	
	@GetMapping("/findhotels")
	public ResponseEntity<List<Hotel>> findHotels(@RequestParam(name="checkin",defaultValue="") String checkIn,
			@RequestParam(name="checkout",defaultValue="") String checkOut,
			@RequestParam(name="location",defaultValue="") String location) {
		
		List<Hotel> foundHotels = new ArrayList<>();
		
		for (Hotel hotel:hotelBookingService.findHotelsByLocation(location)) {
			 Integer count = hotelBookingService.getOccupiedRoomCount(Date.valueOf(checkIn), 
					 	Date.valueOf(checkOut), hotel);
			 if (count != null) {
				 int availableRooms = hotel.getAvailableRooms()-count;
				 if (availableRooms>0) {
					 hotel.setAvailableRooms(availableRooms);
					 foundHotels.add(hotel);
				 } 
			 } else {
				 foundHotels.add(hotel);
			 }	
		}
		return new ResponseEntity<List<Hotel>>(foundHotels, HttpStatus.OK);
	}
	
	@GetMapping("/findhotel")
	public ResponseEntity<Hotel> findHotel(@RequestParam(name="hotelid") String hotelId,
								@RequestParam(name="checkin",defaultValue="") String checkIn,
								@RequestParam(name="checkout",defaultValue="") String checkOut) {
		Hotel hotel = hotelBookingService.findHotelById(hotelId);
		Integer count = hotelBookingService.getOccupiedRoomCount(Date.valueOf(checkIn), Date.valueOf(checkOut), hotel);
		if (count != null) {
			 int availableRooms = hotel.getAvailableRooms()-count;
			 hotel.setAvailableRooms(availableRooms);
		}
		return new ResponseEntity<Hotel>(hotel, HttpStatus.OK);
	}
	
	@PostMapping(path = "/addbooking")
	public ResponseEntity<Booking> addBooking(@RequestBody Booking booking) {
		return new ResponseEntity<Booking>(hotelBookingService.saveBooking(booking), HttpStatus.OK);
	}
	
	@GetMapping(path = "/getbookings")
	public ResponseEntity<List<Booking>> getBookingByUserId(@RequestParam(name="userid") String userId) {
		List<Booking> bookings = hotelBookingService.getBookingByUser(hotelBookingService.getUserById(userId));
		return new ResponseEntity<List<Booking>>(bookings, HttpStatus.OK);
	}
	
	public String decriptString(String str) {
		String encripted="";
		for (int i=0;i<str.length();i++) {
			char c = (char) (str.charAt(i)-3);
			encripted = encripted + c;
		}
		return encripted;
	}
	
}
