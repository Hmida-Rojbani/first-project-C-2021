package de.tekup.first.project.services;

import java.util.NoSuchElementException;
import java.util.Optional;

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
		Optional<Employee> opt = empRepos.findById(id);
		//if(opt.isPresent())
		//	return opt.get();
		//throw new NoSuchElementException("Employee with this id is not found");
		
		return opt.orElseThrow(() -> new NoSuchElementException("Employee with this id is not found"));
		
	}

}
