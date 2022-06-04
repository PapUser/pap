package com.pap.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.pap.controller.service.EmployeeService;
import com.pap.model.Employee;

@RestController
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	EmployeeService empServiceobj;
	
	@GetMapping("employee")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		
		List<Employee> l=empServiceobj.getAllEmployee();
		
		return new ResponseEntity<List<Employee>>(l,HttpStatus.OK);	
		
	}
	
	@PostMapping("employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
//		   System.out.println(dtf.format(now));  
		emp.setCreatedDate(dtf.format(now));
		Employee newEmpObj=empServiceobj.saveEmployee(emp); //=new Employee();//
		
		return new ResponseEntity<Employee>(newEmpObj,HttpStatus.OK);	
		
	}

}
