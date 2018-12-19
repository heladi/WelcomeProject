package com.Login.login;

public class SignupSuccessBean {
	
	private String message;
	
	public SignupSuccessBean(String message) {
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
		return "SignupSuccessBean [message=" + message + "]";
	}
	
}
