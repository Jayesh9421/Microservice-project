package com.emp.service.IMPL;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.emp.entity.Employee;
import com.emp.repo.EmployeeRepo;
import com.emp.response.AddressResponse;
import com.emp.response.EmployeeResponse;
import com.emp.service.EmployeeService;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${addressservice.base.url}")
	private String addressBaseUrl;
	
	@Override
	public EmployeeResponse getEmployeeById(int id) {
		Employee employee = employeeRepo.findById(id)
				.orElseThrow(() -> new RuntimeException(id + "This id is not found"));


		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);

		AddressResponse addressResponse = restTemplate.getForObject(addressBaseUrl+"/{id}", AddressResponse.class , id);
		
		employeeResponse.setAddressResponse(addressResponse);
		
		return employeeResponse;
	}

}
