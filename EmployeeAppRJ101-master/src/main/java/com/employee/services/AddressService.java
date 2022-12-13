package com.employee.services;

import java.util.List;

import com.employee.beans.Address;
import com.employee.beans.Employee;

public interface AddressService {

	public boolean createAddress(Address address);
	
	public List<Address> findAddressByEmployeeId(Integer empId);
	
	public Address findAddressByEmployeeId(Integer empId,Integer addId);
	
	public boolean deleteAddress(Integer empId,Integer addId);
	
	public boolean updateAddress(Integer empId,Integer addId);
}
