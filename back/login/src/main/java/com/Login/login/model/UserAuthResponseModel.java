package com.Login.login.model;

import com.Login.login.response.OperationResponse;

public class UserAuthResponseModel {
	private String name;
	private String token;
	private OperationResponse operationResponse;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public OperationResponse getOperationResponse() {
		return operationResponse;
	}
	public void setOperationResponse(OperationResponse operationResponse) {
		this.operationResponse = operationResponse;
	}
	
	
}
