package com.Login.login.util;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.Login.login.model.LoginRequestModel;

public class LoginRequestModelValidator implements Validator {
	@Override
	public void validate(Object target, Errors errors) {
		// convert the object we takin into UserSignupRequestModel, and store it into model
		LoginRequestModel model = (LoginRequestModel) target;
		
		if (model == null) {
			errors.reject("model is empty");
			return;
		}
		
		if (model.getName() == null || model.getName().isEmpty()) {
			errors.reject("name is empty");
			return;
		}
		
		if (model.getPassword() == null || model.getPassword().isEmpty()) {
			errors.reject("password is empty");
			return;
		}
	}

	@Override
	public boolean supports(Class<?> clazz) {
		
		return LoginRequestModel.class.equals(clazz); // check whether the class we take is UserSignupRequestModel or not
	}
}
