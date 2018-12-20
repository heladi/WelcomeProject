package com.Login.login;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Login.login.model.User;
import com.Login.login.service.impl.UserServiceImpl;

@CrossOrigin(origins="http://localhost:4200")
@RestController //tell Spring this is a Controller and it will be handling HTTP request
public class MyController {
	
	private UserServiceImpl userServiceImpl = new UserServiceImpl();
	
	//signup
	@RequestMapping(method = RequestMethod.POST, path="/signup")//map the POST request to the URI
	public void signup(@RequestBody User user) {
		userServiceImpl.storeUserToDB(user);
		
	}
	//login		
	@GetMapping(path = "/login-successful")//map the GET request to the URI
	public LoginSuccessBean loginSuccessBean() {
		return new LoginSuccessBean("You Login Successfully");
	}
	
	


	
}
