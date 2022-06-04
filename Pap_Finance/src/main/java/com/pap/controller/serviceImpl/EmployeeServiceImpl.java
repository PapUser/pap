package com.pap.controller.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pap.controller.repository.EmployeeRepo;
import com.pap.controller.service.EmployeeService;
import com.pap.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
		@Autowired
		EmployeeRepo empRepoObj;

		@Override
		public List<Employee> getAllEmployee() {

			return empRepoObj.findAll();
		}

		@Override
		public Employee saveEmployee(Employee emp) {
			
			return empRepoObj.save(emp);
		}

}
