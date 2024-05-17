package com.ftn.sbnz.service;

import DTO.LoginFormDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class SampleAppController {
	private static Logger log = LoggerFactory.getLogger(SampleAppController.class);

	private final SampleAppService sampleService;

	@Autowired
	public SampleAppController(SampleAppService sampleService) {
		this.sampleService = sampleService;
	}


	@CrossOrigin
	@PostMapping("/login")
	public String login(@RequestBody LoginFormDTO form) {
		// Ovdje implementirajte logiku za provjeru korisničkih podataka i generiranje odgovora
		String message = "Welcome, " + form.getUsername() + "!";
		return message;
	}
	
	
	
}
