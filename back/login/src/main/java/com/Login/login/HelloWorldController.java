package com.Login.login;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController //tell Spring this is a Controller and it will be handling HTTP request
public class HelloWorldController {
	//GET method
	//URI - /hello-world (browser)
	//method - "Hello World"

	//	@RequestMapping(method=RequestMethod.GET, path="/Hello,world")//map the GET request to the URI

	@GetMapping(path = "/hello-world")//map the GET request to the URI
	public String helloWorld() {
		return "Hello World";
	}
		
	@GetMapping(path = "/hello-world-bean")//map the GET request to the URI
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
}
