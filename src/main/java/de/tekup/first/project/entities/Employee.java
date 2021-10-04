package de.tekup.first.project.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private LocalDate dob;

}
