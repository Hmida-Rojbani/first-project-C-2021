package de.tekup.first.project.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import de.tekup.first.project.models.User;

@Service
@Primary
public class HelloServiceImpl implements HelloService{
	
	
	public String helloWorld() {
		return "Hello World !";
	}
	
	public String helloName(String name) {
		return "Hello "+ name + "!";
	}

	@Override
	public User getUser(String name, int age) {
		return new User(name,age);
	}

}
