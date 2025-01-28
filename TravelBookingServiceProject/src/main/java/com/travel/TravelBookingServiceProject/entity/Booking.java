package com.travel.TravelBookingServiceProject.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingid;

	private String fromLocation;
	private String toLocation;
	private String cabType;
	private String distance;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "fare_id", referencedColumnName = "id")
	private double fare;

	public Booking() {
	}

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public String getCabType() {
		return cabType;
	}

	public void setCabType(String cabType) {
		this.cabType = cabType;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", fromLocation=" + fromLocation + ", toLocation=" + toLocation
				+ ", cabType=" + cabType + ", distance=" + distance + ", fare=" + fare + "]";
	}

	public Booking(int bookingid, String fromLocation, String toLocation, String cabType, String distance, double fare) {
		super();
		this.bookingid = bookingid;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.cabType = cabType;
		this.distance = distance;
		this.fare = fare;
	}

	


}
