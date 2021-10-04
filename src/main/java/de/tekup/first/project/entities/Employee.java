package de.tekup.first.project.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employee_table")
@Data
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 50, nullable = false)
	private String firstName;
	@Column(length = 50, nullable = false)
	private String lastName;
	@Column(length = 70, nullable = false, unique = true)
	private String email;
	
	private LocalDate dob;

}
