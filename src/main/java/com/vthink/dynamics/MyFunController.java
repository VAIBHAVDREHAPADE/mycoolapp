package com.vthink.dynamics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyFunController {
	
	//inject property for the field
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	//Create Endpoints for the fields
	@GetMapping("/getField")
	public String getDetails() {
		return coachName +" "+teamName;
	}

}
