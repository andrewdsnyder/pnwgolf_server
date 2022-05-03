package com.revature.pnwgolf.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.pnwgolf.models.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {

	public Optional<User> findUserByUsername(String username);
	Optional<User> findUserByEmail(String email);
	Optional<User> deleteById(int id);
	Optional<User> findAllUsers();
	
	@Query(nativeQuery=true, value ="SELECT from user-info u where u.email = :email and u.pass = :pass")
	User findUserByEmailAndPassword(String email, String password);
	
	@Query(nativeQuery=true, value = "SELECT from * where player_id :player_id")
	Optional<User> findById(int id);
	

	
}
	

