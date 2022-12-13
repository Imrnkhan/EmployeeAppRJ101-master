package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.employee.services.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
}
