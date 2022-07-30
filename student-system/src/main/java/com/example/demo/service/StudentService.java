package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentByrollNo(Long rollNo);
	
	Student updateStudent(Student student);
	
	void deleteStudentByRollNo(Long rollNo);
	

}
