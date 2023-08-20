package com.task.tourservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.tourservice.model.Tour;

public interface TourRepository extends JpaRepository<Tour, Long> {

}
