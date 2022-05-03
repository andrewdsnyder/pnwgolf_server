package com.revature.pnwgolf.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name="user-info")
public class User {


	@Id
	@GeneratedValue
	@Column(name="player_id")
	private String playerId;
	
	@Column(nullable=false)
	private String username;
	
	@Column(name="first name, nullable = false")
	private String firstName;
	
	@Column(name="last_name", nullable = false)
	private String lastName;
	
	@Email
	@Column(unique = true, nullable = false)
	private String email;
	
	@Column(name="pass", nullable = false)
	private String password;
	
	
	

	public User(String username, String firstName, String lastName, String email, String password, String playerId) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.playerId = playerId;
	}
	

	public User(String username, String firstName, String lastName, String email, String password) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}


	

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", email=" + email
				+ ", password=" + password + ", playerId=" + playerId + " ]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, lastName, password, playerId, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName)
				&& Objects.equals(password, other.password) && Objects.equals(playerId, other.playerId)
				&& Objects.equals(username, other.username);
	}


}
	