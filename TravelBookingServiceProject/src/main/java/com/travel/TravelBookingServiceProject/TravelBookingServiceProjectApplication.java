package com.travel.TravelBookingServiceProject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.travel.TravelBookingServiceProject.entity.Booking;
import com.travel.TravelBookingServiceProject.repo.BookingRepo;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class TravelBookingServiceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelBookingServiceProjectApplication.class, args);
	}

	
	@Autowired
	private BookingRepo repo;
	
	@PostConstruct
	public void initialize() {
		Booking bookingTest = new Booking();
		bookingTest.setFromLocation("Berlin");
		bookingTest.setToLocation("Munich");
		bookingTest.setCabType("Premium");
		bookingTest.setFare(1000);		
		
		
		Booking bookingTest2 = new Booking();
		bookingTest2.setFromLocation("Paris");
		bookingTest2.setToLocation("Rome");
		bookingTest2.setCabType("Basic");
		bookingTest2.setFare(10000);	
		
		Booking bookingTest3 = new Booking();
		bookingTest3.setFromLocation("Brighouse");
		bookingTest3.setToLocation("Leeds");
		bookingTest3.setCabType("Basic");
		bookingTest3.setFare(100);
		
		repo.saveAll(Arrays.asList(bookingTest,bookingTest2,bookingTest3));
		
	}
	
	
}
