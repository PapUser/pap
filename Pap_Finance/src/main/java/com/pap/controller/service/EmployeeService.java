package com.pap.controller.service;

import java.util.List;

import com.pap.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();

	Employee saveEmployee(Employee emp);
	
	

}
