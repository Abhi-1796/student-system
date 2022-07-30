package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
public class Studentcontroller {
	
	private StudentService studentService;

	public Studentcontroller(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//handler to handle list students and return mode and view
	@GetMapping("/Students")
	public String listStudents(Model model) {
		model.addAttribute("Students",studentService.getAllStudents());
		return "Students";
		
	}
	@GetMapping("/Students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "create_student";
		
	}
	@PostMapping("/Students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return"redirect:/Students;";
		
	}
	@GetMapping("/Students/edit/{rollNo}")
	public String editstudentFor(@PathVariable Long rollNo,Model model) {
		model.addAttribute("student",studentService.getStudentByrollNo(rollNo));
		return "edit_student";
	}
	@PostMapping("/Students/{rollNo}")
	public String updateStudent(@PathVariable Long rollNo,
			@ModelAttribute("student") Student student,Model model) {
		Student existingStudent =studentService.getStudentByrollNo(rollNo);
		existingStudent.setRollNo(rollNo);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setFatherName(student.getFatherName());
		existingStudent.setEmail(student.getEmail());
		
		studentService.updateStudent(existingStudent);
		return "redirect:/Students";
		
	
		
	}
	@GetMapping("/Students/{rollNo}")
	public String deleteStudent(@PathVariable Long rollNo) {
		studentService.deleteStudentByRollNo(rollNo);
		return "redirect:/Students";
	}
}
