package com.Login.login.service;

import com.Login.login.model.UserAuthResponseModel;
import com.Login.login.model.LoginRequestModel;
import com.Login.login.model.SignupRequestModel;

public interface UserService {
	
	public UserAuthResponseModel createUser(SignupRequestModel userSignupRequestModel);

	public UserAuthResponseModel loginUser(LoginRequestModel loginRequestModel);
	
//	public void loginUser(User user);

}
