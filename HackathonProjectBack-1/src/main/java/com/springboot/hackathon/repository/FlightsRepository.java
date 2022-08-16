package com.springboot.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hackathon.model.Flights;

public interface FlightsRepository extends JpaRepository<Flights, Long>{

}
