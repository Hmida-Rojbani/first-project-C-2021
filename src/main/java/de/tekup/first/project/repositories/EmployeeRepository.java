package de.tekup.first.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekup.first.project.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
