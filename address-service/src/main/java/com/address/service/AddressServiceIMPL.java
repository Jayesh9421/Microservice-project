package com.address.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.entity.Address;
import com.address.repo.AddressRepo;
import com.address.response.AddressResponse;

@Service
public class AddressServiceIMPL implements AddressService{
	
	@Autowired
	private AddressRepo addressRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public AddressResponse addressResponse(int employeeId) {
		
		Address address = addressRepo.findAddressByEmployeeId(employeeId);
		
		AddressResponse addressResponse = modelMapper.map(address,AddressResponse.class);
		
		
		return addressResponse;
	}
	
}
