package com.Login.login.util;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.Login.login.model.SignupRequestModel;

public class SignupRequestModelValidator implements Validator {
	@Override
	public void validate(Object target, Errors errors) {
		// convert the object we takin into UserSignupRequestModel, and store it into model
		SignupRequestModel model = (SignupRequestModel) target;
		
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
		
		return SignupRequestModel.class.equals(clazz); // check whether the class we take is UserSignupRequestModel or not
	}
	

}
