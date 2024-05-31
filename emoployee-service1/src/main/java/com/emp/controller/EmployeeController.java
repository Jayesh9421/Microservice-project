package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.emp.repo.EmployeeRepo;
import com.emp.response.EmployeeResponse;
import com.emp.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired 
	private EmployeeService employeeService;
	
	@GetMapping("/employeeId/{id}")
	public ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable int id){
		
		EmployeeResponse employeeById = employeeService.getEmployeeById(id);
		
		return ResponseEntity.ok(employeeById);
		
	}
}
