package com.Login.login;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Login.login.model.UserAuthResponseModel;
import com.Login.login.model.LoginRequestModel;
import com.Login.login.model.SignupRequestModel;
import com.Login.login.response.OperationResponse;
import com.Login.login.service.UserService;
import com.Login.login.util.LoginRequestModelValidator;
import com.Login.login.util.SignupRequestModelValidator;


@RestController //tell Spring this is a Controller and it will be handling HTTP request
public class MyController {
	
	private static Logger LOGGER = Logger.getLogger(MyController.class); //????????????????????

	@Autowired
	private UserService userService;
	
	@Autowired
	private SignupRequestModelValidator signupRequestModelValidator;//create a new validator to validate signup request model
	private LoginRequestModelValidator loginRequestModelValidator;//create a new validator to validate signup request model
	//signup
	@RequestMapping(method = RequestMethod.POST, path="/signup")//map the POST request to the URI
	public ResponseEntity<UserAuthResponseModel> signupUser(@RequestBody SignupRequestModel SignupRequestModel, BindingResult result) {

		//create a new response object
		UserAuthResponseModel response = new UserAuthResponseModel();

		//BingdingResult class extends Error class, here we pass request model and error into validate method
		signupRequestModelValidator.validate(SignupRequestModel, result);
		if(result.hasErrors()) {
			//get all errors from result and set them to the response
			response.setOperationResponse(OperationResponse.getFailedResponse(result.getAllErrors().get(0).toString()));
			
			return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST); //???????????
		}
		
		try {
			response = userService.createUser(SignupRequestModel); //???????????
			
		}catch (Exception e) {
			e.printStackTrace();
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); //???????????
				
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	
	//login		
	@GetMapping(path = "/login")//map the GET request to the URI
	public ResponseEntity<UserAuthResponseModel> loginUser(@RequestBody LoginRequestModel loginRequestModel, BindingResult result) {
		UserAuthResponseModel response = new UserAuthResponseModel();
		loginRequestModelValidator.validate(loginRequestModelValidator, result);
		if(result.hasErrors()) {
			//get all errors from result and set them to the response
			response.setOperationResponse(OperationResponse.getFailedResponse(result.getAllErrors().get(0).toString()));
			
			return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST); //???????????
		}
				
		try {
			response = userService.loginUser(loginRequestModel); //???????????
			
		}catch (Exception e) {
			e.printStackTrace();
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); //???????????
				
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
		
		return null;
		
	}
	


	
}
