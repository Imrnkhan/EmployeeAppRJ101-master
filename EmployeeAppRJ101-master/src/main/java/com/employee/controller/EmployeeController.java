package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.beans.Employee;
import com.employee.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees")
	@ResponseBody
	public ResponseEntity<String> createEmployee(@RequestBody Employee employee){
		
		employeeService.createEmployee(employee);
	
		return new ResponseEntity<String>("Employee added",HttpStatus.CREATED);
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		
		List<Employee> employees=employeeService.findAllEmployee();
		return new ResponseEntity<List<Employee>>(employees,HttpStatus.FOUND);
	}
//	
	@GetMapping("/employees/{id}")
	@ResponseBody
	public ResponseEntity<Employee> getEmployeeById(@PathVariable ("id") int id){
		
		Employee emp=employeeService.findEmployeeById(id);
		return  new ResponseEntity<>(emp,HttpStatus.FOUND);
	}
//	
	@PutMapping("/employees/{id}")
	public ResponseEntity<String> updtaeEmployeeById(@PathVariable ("id") int id){
		
		
		
		return new ResponseEntity<String>("Employee Updated",HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<String> deleteTutorialById(@PathVariable ("id") int id){
		
		employeeService.deleteEmployee(id);
	
		
		return new ResponseEntity<String>("Employee Deleted",HttpStatus.OK);
	}
	

	
	
	
}
