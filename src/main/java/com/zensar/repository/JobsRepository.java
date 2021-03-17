package com.zensar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zensar.entities.Jobs;
import com.zensar.entities.Recruiter;

public interface JobsRepository extends JpaRepository<Jobs, Integer> {
	
	

}
