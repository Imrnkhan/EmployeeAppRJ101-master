package com.employee.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.beans.Address;

@Service
public class AddressServiceImpl implements AddressService{

	@Override
	public boolean createAddress(Address address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Address> findAddressByEmployeeId(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findAddressByEmployeeId(Integer empId, Integer addId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAddress(Integer empId, Integer addId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAddress(Integer empId, Integer addId) {
		// TODO Auto-generated method stub
		return false;
	}

}
