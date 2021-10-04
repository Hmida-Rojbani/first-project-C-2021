package de.tekup.first.project.services;

import org.springframework.stereotype.Service;

import de.tekup.first.project.entities.Employee;
import de.tekup.first.project.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {
	
	private EmployeeRepository empRepos;
	
	public Employee saveEmp(Employee employee) {
		return empRepos.save(employee);
	}
	
	public Employee getEmpById(int id) {
		return empRepos.getById(id);
	}

}
