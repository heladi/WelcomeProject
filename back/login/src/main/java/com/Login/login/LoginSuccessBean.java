package com.Login.login;

public class LoginSuccessBean {
	
	private String message;
	
	public LoginSuccessBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "LoginSuccessBean [message=" + message + "]";
	}
	
}
