package com.travel.TravelBookingServiceProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double distance;
    private int cabType;
    private double totalFare;

    // Constructors
    public Fare() {}

    public Fare(double distance, int cabType, double totalFare) {
        this.distance = distance;
        this.cabType = cabType;
        this.totalFare = totalFare;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getCabType() {
        return cabType;
    }

    public void setCabType(int cabType) {
        this.cabType = cabType;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }
}