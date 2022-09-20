package com.mcsv.hello.hello1.web;

//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import com.mcsv.hello.hello1.service.Hello1Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello1RestController {

	private Hello1Service hello1Service;

	public Hello1RestController(Hello1Service hello1Service){
		this.hello1Service = hello1Service;
	}
	/*
	@GetMapping("/hello/{id}")
	public String helloWorld(@PathVariable Integer id) {
		return "Hello World " + id;
	}
	 */
	@GetMapping("/welcome")
	public String welcome(@RequestParam(defaultValue = "Stranger") String name){
		return hello1Service.getWelcomeMessage(name);
	}

}
