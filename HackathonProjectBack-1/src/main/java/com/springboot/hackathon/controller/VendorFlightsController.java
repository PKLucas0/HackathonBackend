package com.springboot.hackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hackathon.model.Flights;
import com.springboot.hackathon.model.Vendor;
import com.springboot.hackathon.model.VendorFlights;
import com.springboot.hackathon.repository.FlightsRepository;
import com.springboot.hackathon.repository.VendorFlightsRepository;
import com.springboot.hackathon.repository.VendorRepository;

@RestController
public class VendorFlightsController {
	
	@Autowired
	private FlightsRepository flightsRepo;
	
	@Autowired
	private VendorRepository vendorRepo;
	
	@Autowired
	private VendorFlightsRepository vendorFlightsRepo;
	
	@PostMapping("/flight")
	public void addFlight(@RequestBody Flights flights) {
		flightsRepo.save(flights);
	}
	
	@PostMapping("/vendor")
	public void addVendor(@RequestBody Vendor vendor) {
		vendorRepo.save(vendor);
	}
	
	@GetMapping("/getFlights")
	public List<VendorFlights> getallFlights(){
		return vendorFlightsRepo.findAll();
	}

}
