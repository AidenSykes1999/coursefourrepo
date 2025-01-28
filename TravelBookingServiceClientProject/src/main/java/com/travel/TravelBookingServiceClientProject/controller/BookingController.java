package com.travel.TravelBookingServiceClientProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.travel.TravelBookingServiceClientProject.entity.Booking;


@Controller
public class BookingController {

	@Autowired
	private RestTemplate template;
	String url = "http://localhost:8080/bookings";
	
	@GetMapping("/list")
	public String getAllBookings(@RequestParam(required = false) String fromLocation,
			@RequestParam(required = false) String toLocation,Model model){
		ResponseEntity<List<Booking>> response = null;
		if(fromLocation != null && toLocation!=null) {
			response = template.exchange(url+"?fromLocation="+fromLocation+"&toLocation="+toLocation, HttpMethod.GET, null, new ParameterizedTypeReference<List<Booking>>() {
			});
		}
		else
		response = template.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Booking>>() {
		});
		List<Booking> bookings = response.getBody();
		model.addAttribute("bookings", bookings);
		return "bookinglist";
		
	}
	
	@GetMapping("/add")
	public String addBookingForm() {
		return "booking";
	}
	@PostMapping("/add")
	public String addNewBooking(@ModelAttribute Booking booking) {
		
		booking.setBookingid(0);
		System.out.println(booking);
		Booking bookingsaved = template.postForObject(url, booking, Booking.class);
		
		System.out.println(bookingsaved);
		
		return "redirect:/list";
	}

}
