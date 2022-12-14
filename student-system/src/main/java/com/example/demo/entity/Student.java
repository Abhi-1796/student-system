package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name = "Students")

public class Student {
	
	@Column(name = "first_name",nullable = false)
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "father_name")
	private String fatherName;
	@Column(name = "email")
	private String email;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rollNo;
	
	public Student() {
		
	}
	public Student(String firstName, String lastName, String fatherName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getRollNo() {
		return rollNo;
	}
	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}
	

}
