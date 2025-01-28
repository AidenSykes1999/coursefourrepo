package com.travel.TravelBookingServiceProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.TravelBookingServiceProject.repo.BookingRepo;
import com.travel.TravelBookingServiceProject.entity.Booking;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class BookingService {

	@Autowired
	private BookingRepo repo;

	public List<Booking> fetchAllBookings(){

		return repo.findAll();
	}
	public Booking addNewBooking(Booking booking){
		if(repo.existsById(booking.getBookingid()))
			throw new EntityExistsException("Cannot add "+booking.getBookingid()+" already exists");
		return repo.save(booking);

	}

	public Booking getBookingById(int id){
		if(!repo.existsById(id))
			throw new EntityNotFoundException(id+" not found");
		return repo.findById(id).get();
	}

	public List<Booking> fetchAllBookingsFromTo(String fromLocation, String toLocation){

		return repo.findByFromLocationAndToLocation(fromLocation, toLocation);
	}

}
