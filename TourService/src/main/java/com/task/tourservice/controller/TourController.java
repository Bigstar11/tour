package com.task.tourservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.tourservice.model.Tour;
import com.task.tourservice.repository.TourRepository;


@RestController
@RequestMapping("/tour")
public class TourController {
	
	@Autowired
	TourRepository tRepository;
	
	@GetMapping("/getall")
	public List<Tour> getAllTours(){
		return tRepository.findAll();
	}
	
	@PutMapping("/update/{tour_id}")
	public String updateUserById(@PathVariable Long tour_id, @RequestBody Tour tour) {
		System.out.println("update method called");
		
		Optional<Tour> optionalTour = tRepository.findById(tour_id);
		
		System.out.println(optionalTour);
		if(optionalTour.isPresent()) {
			Tour tour1 = new Tour();
			tour1.setName(tour.getName());
			tour1.setDate(tour.getDate());
			tour1.setStatus(tour.getStatus());
		    tour1.setTour_Id(tour.getTour_Id());
			tRepository.save(tour1);
			return "update success";	
		}
		return "no such tour present";		
	}
	
	@PostMapping("/add")
	public String addTour(@RequestBody Tour tour ){
		System.out.println("add method called");
		
		tRepository.save(tour);
		
		return "Save success";
	}
	

}

