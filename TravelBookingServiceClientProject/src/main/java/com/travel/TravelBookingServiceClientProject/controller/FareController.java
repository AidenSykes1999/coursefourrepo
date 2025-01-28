package com.travel.TravelBookingServiceClientProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FareController {
    
    @GetMapping("/fare")
    public String showFarePage() {
        return "fares"; 
    }

    @PostMapping("/fare")
    public String calculateFare(@RequestParam double distance, @RequestParam String cabType, Model model) {
        double fare;

        switch (cabType) {
            case "Basic":
                fare = distance * 2;
                break;
            case "Premium":
                fare = distance * 1.5;
                break;
            case "Premium+":
                fare = distance * 1.2;
                break;
            default:
                model.addAttribute("error", "Invalid cab type.");
                return "fares"; 
        }

        model.addAttribute("fare", String.format("%.2f", fare));
        return "fares"; 
    }
}