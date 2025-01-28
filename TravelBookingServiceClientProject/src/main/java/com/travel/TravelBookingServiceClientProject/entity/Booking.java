package com.travel.TravelBookingServiceClientProject.entity;


public class Booking {

	private int bookingid;
	private String fromLocation;
	private String toLocation;
	private String distance;
	private String cabType;
	private double fare;

	public Booking() {
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
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

	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", fromLocation=" + fromLocation + ", toLocation=" + toLocation
				+ ", distance=" + distance + ", cabType=" + cabType + ", fare=" + fare + "]";
	}

	public Booking(int bookingid, String fromLocation, String toLocation, String distance, String cabType, double fare) {
		super();
		this.bookingid = bookingid;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.distance = distance;
		this.cabType = cabType;
		this.fare = fare;
	}

	


}