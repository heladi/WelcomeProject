package com.Login.login.service.impl;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Login.login.dao.UserDAO;
import com.Login.login.entity.User;
import com.Login.login.model.UserAuthResponseModel;
import com.Login.login.model.LoginRequestModel;
import com.Login.login.model.SignupRequestModel;
import com.Login.login.response.OperationResponse;
import com.Login.login.service.UserService;
import com.Login.login.util.EncryptionUtil;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	private UserDAO userDAO_;
	
	public UserAuthResponseModel createUser(SignupRequestModel model) {
		
		//crerate new resonse model instance authModel
		UserAuthResponseModel authModel = new UserAuthResponseModel();
		
		//when name already exists, set response and return authModel 
		if (isUserExist(model.getName())) {
			authModel.setOperationResponse(OperationResponse.getFailedResponse("name alrady exists!"));
			return authModel;
		}
		
		//if name does NOT exist, we can create a new user.
		User user = new User();
		//save everthing in model into user
		user =saveUser(user);
		user.setName(model.getName());
		user.setPassword(EncryptionUtil.saltPassword(model.getPassword()));
		
		String token =UUID.randomUUID().toString();
		user.setToken(token);
		user.setTokenExpireTime(null);
		
		//set token/name/operationResponse to authModel
		authModel.setName(user.getName());
		authModel.setToken(token);
//		authModel.setId(user.getId());
		authModel.setOperationResponse(OperationResponse.getSuccessResponse());
		
		return authModel;
	}
	
	
	//save user through User.java
	private User saveUser(User user) {
		userDAO.save(user); // save method is from CurdRepository
		return user;
	}
	
	//whether user already exists
	private boolean isUserExist(String name) {
		User oldUser = userDAO.findByname(name);
		return oldUser != null;
	}
	
	
	public UserAuthResponseModel loginUser(LoginRequestModel model) {
		//crerate new resonse model instance authModel
		UserAuthResponseModel authModel = new UserAuthResponseModel();
		//when name already exists, set response and return authModel 
		if (isUserExist(model.getName())) {
			model.getName

		}
		return 
	};
}
