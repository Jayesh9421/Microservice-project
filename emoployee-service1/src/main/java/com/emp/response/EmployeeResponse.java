package com.emp.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeResponse {
	
	private int id;
	private String name;
	private String email;
	private String bloodGroup;
	private AddressResponse addressResponse;
}
