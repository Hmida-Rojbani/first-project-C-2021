package de.tekup.first.project.services;

import de.tekup.first.project.models.User;

public interface HelloService {
	
	public String helloWorld();
	public String helloName(String name);
	User getUser(String name, int age);
	
}
