package com.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.address.response.AddressResponse;
import com.address.service.AddressService;
import com.address.service.AddressServiceIMPL;

@RestController
public class AddressController {

	@Autowired
	private AddressServiceIMPL addressService;

	@GetMapping("/address/{id}")
	public ResponseEntity<AddressResponse> findAdressByEmployeeId(@PathVariable int id) {

//		AddressResponse addressResponse = null;
		AddressResponse addressResponse = addressService.addressResponse(id);

		return new ResponseEntity<AddressResponse>(addressResponse, HttpStatus.OK);
	}

}
