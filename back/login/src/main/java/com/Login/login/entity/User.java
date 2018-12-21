package com.Login.login.entity;

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
	private String token;
	private String tokenExpireTime;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTokenExpireTime() {
		return tokenExpireTime;
	}

	public void setTokenExpireTime(String tokenExpireTime) {
		this.tokenExpireTime = tokenExpireTime;
	}

	public User() {
		
	}
	
//	public User(String name, String password) {
//		super();
//		this.name = name;
//		this.password = password;
//	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}


	
}
