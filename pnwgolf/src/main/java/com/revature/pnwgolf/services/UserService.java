package com.revature.pnwgolf.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.persistence.PersistenceException;

import com.revature.pnwgolf.models.User;
import com.revature.pnwgolf.repository.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

	private UserDao userDao;

	public UserService() {

	}

	@Autowired
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}

	@Transactional
	public void registerNewUser(User user) {

		User newUser = new User(user.getUsername(), user.getFirstName(), user.getLastName(), user.getEmail(),
				user.getPassword());
		newUser.setPlayerId(UUID.randomUUID().toString());
		User persistedUser = userDao.save(newUser);
		if (persistedUser == null) {
			throw new PersistenceException("user could not be persisted");

		}

	}

	@Transactional
	public void updateUser(User updateUser) {
		User persistedUser = userDao.save(updateUser);
		if (persistedUser == null) {
			throw new PersistenceException("user could not be persisted");
		}
	}

	@Transactional
	public Optional<User> getAllUsers() {
		return userDao.findAllUsers();
	}

	@Transactional
	public Optional<User> findUserById(int id) {
		return userDao.findById(id);

	}

	@Transactional
	public boolean isEmailAvailable(String email) {
		return !(userDao.findUserByEmail(email).isPresent());
	}

	@Transactional
	public boolean isUsernameAvailable(String username) {
		return !(userDao.findUserByUsername(username).isPresent());
	}

	@Transactional
	public void removeUserByUsername(String username) {
		userDao.deleteById(username);
	}

	public Optional<User> findUserByUsername(String username) {
		return userDao.findUserByUsername(username);
	}
}