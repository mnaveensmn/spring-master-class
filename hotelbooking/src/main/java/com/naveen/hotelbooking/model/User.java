package com.naveen.hotelbooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_user")
public class User {

	@Id
	@Column(name="user_id")
	private String userId;
	
	private String password;
	
	private String name;
	
	/*@OneToMany(cascade=CascadeType.ALL, mappedBy="user")
	private Set<Booking> booking;*/

	public User() {
		
	}
	
	public User(String userId) {
		this.userId =  userId;
	}

	public User(String userId,String password) {
		this.userId = userId;
		this.password = password;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*public Set<Booking> getBooking() {
		return booking;
	}

	public void setBooking(Set<Booking> booking) {
		this.booking = booking;
	}*/
}
