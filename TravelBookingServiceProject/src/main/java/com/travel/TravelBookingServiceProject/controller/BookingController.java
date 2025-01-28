package com.travel.TravelBookingServiceProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travel.TravelBookingServiceProject.entity.Booking;
import com.travel.TravelBookingServiceProject.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
	
	
	@Autowired
	private BookingService service;
	
	@GetMapping
	public List<Booking> getAllBookings(@RequestParam(required = false) String fromLocation, 
			@RequestParam(required = false) String toLocation){
		if(fromLocation != null && toLocation!=null)
			return service.fetchAllBookingsFromTo(fromLocation, toLocation);
		return service.fetchAllBookings();
	}
	
	@PostMapping
	public Booking addBooking(@RequestBody Booking booking) {
		System.out.println("Booking "+booking);
		return service.addNewBooking(booking);
	}
	@GetMapping("/{id}")
	public Booking getBookingById(@PathVariable int id){
		
		return service.getBookingById(id);
	}

}
