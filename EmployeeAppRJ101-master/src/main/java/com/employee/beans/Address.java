package com.employee.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;

@Data
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	private String street;
	private String city;
	private String state;
	private String country;
}
