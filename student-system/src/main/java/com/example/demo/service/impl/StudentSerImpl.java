package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentSerImpl implements StudentService {
	
	private StudentRepository studentRepository;
	
	
	
	
	public StudentSerImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}




	@Override
	public List<Student> getAllStudents(){
		
		return studentRepository.findAll();
	}




	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}




	@Override
	public Student getStudentByrollNo(Long rollNo) {
		// TODO Auto-generated method stub
		return studentRepository.findById(rollNo).get();
	}




	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}




	@Override
	public void deleteStudentByRollNo(Long rollNo) {
		studentRepository.deleteById(rollNo);
	}
	

}
