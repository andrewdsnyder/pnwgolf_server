package com.revature.pnwgolf.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.revature.pnwgolf.services.UserService;



@Service
public class JWTUserDetailsService implements UserDetailsService {
	private final UserService userService;

	public JWTUserDetailsService(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<com.revature.pnwgolf.models.User> user = userService.findUserByUsername(username);
		if (user.isPresent()) {
			return new User(user.get().getUsername(), user.get().getPassword(), new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}