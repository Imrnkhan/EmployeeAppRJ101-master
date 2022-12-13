package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.beans.Address;

@Repository
public interface AddressDao extends  JpaRepository<Address, Integer>{

	
}
