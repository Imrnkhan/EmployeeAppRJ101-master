package com.employee.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String mobile;
	
	@JsonIgnoreProperties(value= {
			"city",
			"state",
			"street",
			"country"
	})
	@OneToMany(cascade= CascadeType.ALL)
	private List<Address> address=new ArrayList<>();
}
