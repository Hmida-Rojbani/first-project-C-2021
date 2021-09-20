package de.tekup.first.project.services;

import org.springframework.stereotype.Service;

import de.tekup.first.project.models.User;

@Service
public class HelloServiceImplV2 implements HelloService{
	public String helloWorld() {
		return "Hello World !!!";
	}
	
	public String helloName(String name) {
		return "Hello "+ name + "!!!";
	}

	@Override
	public User getUser(String name, int age) {
		// TODO Auto-generated method stub
		return null;
	}
}
