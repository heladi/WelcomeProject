package com.Login.login;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController //tell Spring this is a Controller and it will be handling HTTP request
public class MyController {
	//GET method
	//URI - /hello-world (browser)
	//method - "Hello World"

	//	@RequestMapping(method=RequestMethod.GET, path="/Hello,world")//map the GET request to the URI

	@GetMapping(path = "/sign-up")//map the GET request to the URI
	public String helloWorld() {
		return "Hello World";
	}
		
	@GetMapping(path = "/sign-up-successful")//map the GET request to the URI
	public SignupSuccessBean helloWorldBean() {
		return new SignupSuccessBean("You Sign Up Successfully");
	}
}
