package com.zensar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value="jobseeker")
public class JobSeekerController {
	@RequestMapping(value="/joblogin",method=RequestMethod.GET)
	public String getJobSeekerLoginPage() {
		return "jobseeker_login";
	}
	
	@RequestMapping(value="/recruiter",method=RequestMethod.GET)
	public String getRecruiterLoginPage() {
		return "redirect:/login";
	}
	
	@RequestMapping(value="/jobregister",method=RequestMethod.GET)
	public String getJobSeekerRegisterPage() {
		return "jobseeker_register";
	}
}
