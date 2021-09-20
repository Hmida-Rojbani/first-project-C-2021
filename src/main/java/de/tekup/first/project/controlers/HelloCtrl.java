package de.tekup.first.project.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.first.project.models.User;
import de.tekup.first.project.services.HelloService;

@RestController
public class HelloCtrl {
	
	private HelloService service;
	
	public HelloCtrl(HelloService service) {
		super();
		this.service = service;
	}

	//@RequestMapping(path = "/hello", method = {RequestMethod.GET, RequestMethod.PUT})
	@GetMapping("/hello")
	public String sayHello() {
		return service.helloWorld();
	}
	
	@RequestMapping(path = "/hello/{value}")
	public String sayHello(@PathVariable("value") String name) {
		return service.helloName(name);
	}
	
	@GetMapping("/create/{name}/{age}")
	public User createUser(@PathVariable("name") String name, @PathVariable("age") int age) {
		User user =service.getUser(name, age);
//		if(user != null)
//			return new ResponseEntity<User> (user,HttpStatus.CREATED);
//		return new ResponseEntity<User> (user,HttpStatus.BAD_REQUEST);
		return user;
	}
	
	
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return user;
	}

//	@Autowired
//	public void setService(HelloService service) {
//		this.service = service;
//	}
	
	

}
