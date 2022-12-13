package com.employee.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Exceptions.EmployeeNotFound;
import com.employee.Exceptions.MobileNumberAlreadyExist;
import com.employee.beans.Employee;
import com.employee.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public boolean createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		Optional<Employee> optEmp=employeeDao.findByMobile(employee.getMobile());
		
		if(optEmp.isPresent()) {
			throw new MobileNumberAlreadyExist("Employee with this mobile number already exist");
		}
		else {
			employeeDao.save(employee); 
		}
		return false;
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		
		Optional<Employee> emp=employeeDao.findById(id);
		
		if(emp.isPresent()) {
			return emp.get();
		}
		throw new EmployeeNotFound("Employee with this id does not exist");
	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		
		List<Employee> emp=employeeDao.findAll();
		if(emp.size()!=0) {
			return emp;
		}
		throw new EmployeeNotFound("Employee does not exist in your system");
	}

	@Override
	public boolean deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employee> emp=employeeDao.findById(id);
		
		if(emp.isPresent()) {
			employeeDao.delete(emp.get());
			return true;
		}
		throw new EmployeeNotFound("Employee with this id does not exist");
		
	}

	@Override
	public boolean updateEmployee(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
