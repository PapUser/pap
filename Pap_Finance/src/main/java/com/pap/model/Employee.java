package com.pap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empid;
	private String firstName;
	private String middleName;
	private String lastName;
	private String designation;
	private Double salary;
	private String password;
	private String status;
	private String address;
	private String dob;
	private String email;
	private byte[] profile;
	private String createdDate;
	private Integer createdUserId;

}
