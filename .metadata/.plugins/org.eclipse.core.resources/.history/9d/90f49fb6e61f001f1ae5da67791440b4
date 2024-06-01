package com.address.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.address.response.AddressResponse;

@RestController
public class AddressController {

	@GetMapping("/address/{empId}")
	public ResponseEntity<AddressResponse > getAdressByEmployeeId(@PathVariable("empId") int id) {
		
		AddressResponse addressResponse = null;
		
		return new ResponseEntity<AddressResponse>(addressResponse , HttpStatus.OK);
	}
	
}
