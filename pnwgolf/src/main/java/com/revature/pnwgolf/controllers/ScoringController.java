package com.revature.pnwgolf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pnwgolf.models.Scoring;
import com.revature.pnwgolf.models.User;
import com.revature.pnwgolf.services.ScoringService;
import com.revature.pnwgolf.services.UserService;
import com.revature.pnwgolf.web.dto.ScoringRequest;

@CrossOrigin
@RestController
public class ScoringController {

	
	@Autowired
	ScoringService scoringService;

	@PostMapping(value = "/add_score", 
			consumes = "application/json", 
			produces = "application/json")
	
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
public ResponseEntity<Scoring> addNewScore(ScoringRequest scoringRequest) {
		scoringService.addScore(scoringRequest);
	}
}
