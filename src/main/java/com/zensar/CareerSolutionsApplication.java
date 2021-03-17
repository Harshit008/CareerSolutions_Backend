package com.zensar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.zensar.controller.JobSeekerController;
import com.zensar.controller.RecruiterController;

@SpringBootApplication
public class CareerSolutionsApplication {
	@Autowired
	private RecruiterController recruiterController;
	@Autowired
	private JobSeekerController jobseekerController;
	public static void main(String[] args) {
		SpringApplication.run(CareerSolutionsApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }

}
