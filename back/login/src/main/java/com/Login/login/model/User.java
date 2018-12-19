package com.Login.login.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Table - User
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String password;


	protected User() {
		
	}
	
	public User(long id, String name, String password) {
		super();
//		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String gepassword() {
		return password;
	}
	
}
