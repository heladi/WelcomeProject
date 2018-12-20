package com.Login.login.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Table - User
@Entity
public class User {

	// Auto-generate user id
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String password;


	public User() {
		
	}
	
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}
	
}
