package com.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.beans.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	Optional<Employee> findByMobile(String mob);
	
}
