package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class JobSeeker {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jobSeekerId;
	private String name;
	private String password;
	private String username;
	private String email;
	
}
