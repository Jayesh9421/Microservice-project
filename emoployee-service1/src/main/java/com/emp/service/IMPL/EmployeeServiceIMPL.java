package com.emp.service.IMPL;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emp.entity.Employee;
import com.emp.repo.EmployeeRepo;
import com.emp.response.EmployeeResponse;
import com.emp.service.EmployeeService;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public EmployeeResponse getEmployeeById(int id) {
		Employee employee = employeeRepo.findById(id)
				.orElseThrow(() -> new RuntimeException(id + "This id is not found"));

//		EmployeeResponse employeeResponse = new EmployeeResponse();
//		employeeResponse.setId(employee.getId());
//		employeeResponse.setName(employee.getName());
//		employeeResponse.setEmail(employee.getEmail());
//		employeeResponse.setBloodGroup(employee.getBloodGroup());

		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);

		return employeeResponse;
	}

}
