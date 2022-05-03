package com.revature.pnwgolf.controllers;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pnwgolf.models.User;
import com.revature.pnwgolf.services.UserService;


@CrossOrigin
@RestController
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping(value = "/registration", consumes = "application/json", produces = "application/json")

	@ResponseStatus(HttpStatus.CREATED)

	public ResponseEntity<User> registration(User userRequest) {
		if (userService.isUsernameAvailable(userRequest.getUsername())) {
			if (userService.isEmailAvailable(userRequest.getEmail())) {
				userService.registerNewUser(userRequest);
				return new ResponseEntity<>(HttpStatus.CREATED);
			} else {
				return new ResponseEntity<>(HttpStatus.CONFLICT);
			}
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)

	public User findUserById(@RequestParam int id) {
		return userService.findUserById(id).get();
	}

	@GetMapping("/me")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public User getUsernameFromToken(Authentication auth) {
		return userService.findUserByUsername(auth.getName()).get();
	}

	@PutMapping("/updateUser")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<User> updateUser(@RequestBody User updateUser, Authentication auth) {
		User user = new User(user.getUsername(), updateUser.getFirstName(), updateUser.getLastName(),
				updateUser.getEmail(), updateUser.getPassword(), updateUser.getPlayerId());
		userService.updateUser(updateUser);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
