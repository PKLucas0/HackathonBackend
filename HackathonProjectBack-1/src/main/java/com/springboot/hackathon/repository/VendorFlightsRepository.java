package com.springboot.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hackathon.model.VendorFlights;

public interface VendorFlightsRepository extends JpaRepository<VendorFlights, Long>{

}
