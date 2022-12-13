package com.employee.services;

import java.util.List;

import com.employee.beans.Employee;

public interface EmployeeService {

	
	public boolean createEmployee(Employee employee);
	
	public Employee findEmployeeById(Integer id);
	
	public List<Employee> findAllEmployee();
	
	public boolean deleteEmployee(Integer Id);
	
	public boolean updateEmployee(int id);
}
