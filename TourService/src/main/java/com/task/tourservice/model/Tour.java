package com.task.tourservice.model;

//import java.util.Date;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tour")
public class Tour {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long tour_Id;
		
		@Column(name = "tour_name")
		private String name;
		
		@Column(name = "tour_date")
		private Date date;
		
		@Column(name="tour_status")
		private String status;

		public Tour(Long tour_Id, String name, Date date, String status) {
			super();
			this.tour_Id = tour_Id;
			this.name = name;
			this.date = date;
			this.status = status;
		}
		
		public Tour() {}
		
		public Long getTour_Id() {
			return tour_Id;
		}

		public void setTour_Id(Long tour_Id) {
			this.tour_Id = tour_Id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}	
}
