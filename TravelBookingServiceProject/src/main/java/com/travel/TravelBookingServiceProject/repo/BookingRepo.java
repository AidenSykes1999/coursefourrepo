package com.travel.TravelBookingServiceProject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.TravelBookingServiceProject.entity.Booking;

public interface BookingRepo extends JpaRepository<Booking, Integer> {

	public List<Booking> findByFromLocationAndToLocation(String fromLocation, String toLocation);

}
