package com.naveen.hotelbooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_hotel")
public class Hotel {
	
	@Id
	@Column(name="hotel_id")
	private String hotelId;
	
	@Column(name="hotel_name")
	private String hotelName;
	
	@Column(name="rooms_available")
	private int availableRooms;
	
	@Column(name="price_per_room")
	private double pricePerRoom;
	
	private String location;
	
	@Column(name="image_url")
	private String imageUrl;

	/*@OneToMany(cascade=CascadeType.ALL, mappedBy="hotel")
	private Set<Booking> booking;*/
	
	public Hotel() {
		
	}
	
	public Hotel(String hotelId) {
		this.hotelId = hotelId;
	}
	
	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getAvailableRooms() {
		return availableRooms;
	}

	public void setAvailableRooms(int availableRooms) {
		this.availableRooms = availableRooms;
	}

	public double getPricePerRoom() {
		return pricePerRoom;
	}

	public void setPricePerRoom(double pricePerRoom) {
		this.pricePerRoom = pricePerRoom;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	@Override
	public String toString() {
		return this.hotelId;
	}
	
}
